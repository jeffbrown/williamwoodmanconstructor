package williamwoodmanconstructor

import grails.rest.RestfulController

class JsonApiRestfulController<T> extends RestfulController<T> {

    JsonApiRestfulController(Class<T> c) {
        super(c, false)
    }
}
