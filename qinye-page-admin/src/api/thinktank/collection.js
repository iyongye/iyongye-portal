import request from '@/utils/request'

// 查询征集列表
export function listCollection(query) {
  return request({
    url: '/thinktank/collection/list',
    method: 'get',
    params: query
  })
}

// 查询征集详细
export function getCollection(id) {
  return request({
    url: '/thinktank/collection/' + id,
    method: 'get'
  })
}

// 新增征集
export function addCollection(data) {
  return request({
    url: '/thinktank/collection',
    method: 'post',
    data: data
  })
}

// 修改征集
export function updateCollection(data) {
  return request({
    url: '/thinktank/collection',
    method: 'put',
    data: data
  })
}

// 删除征集
export function delCollection(id) {
  return request({
    url: '/thinktank/collection/' + id,
    method: 'delete'
  })
}

// 导出征集
export function exportCollection(query) {
  return request({
    url: '/thinktank/collection/export',
    method: 'get',
    params: query
  })
}
