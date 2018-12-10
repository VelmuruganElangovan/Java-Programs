#!/bin/bash

ip link set dev eth0 down 
ip addr flush dev eth0 
. /var/smoothwall/ethernet/settings 
ip addr add $GREEN_ADDRESS/$GREEN_NETMASK dev $GREEN_DEV
ip link set dev eth0 up
ip route add default via $DEFAULT_GATEWAY 
