package jp.ddd.server.usecase.web.outputport;

import jp.ddd.server.adapter.web.presenter.output.ResultJson;
import jp.ddd.server.adapter.web.presenter.output.message.RegisteredMessageJson;
import jp.ddd.server.domain.entity.message.Message;

/**
 * ユーザのUseCaseに関するInPutPortです。
 * Created by noguchi_kohei
 */
public interface MessagePresenter {

    ResultJson<RegisteredMessageJson> toRegisteredJson(Message message);
}
