package com.nabobery.sdkgen.github.generated.gists

import com.nabobery.sdkgen.github.generated.BaseGist
import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.GistComment
import com.nabobery.sdkgen.github.generated.GistCommit
import com.nabobery.sdkgen.github.generated.GistSimple
import com.nabobery.sdkgen.github.generated.InlineForbiddenGistResponseJsonX346772b5
import com.nabobery.sdkgen.github.generated.InlineGistsCommentsPatchRequestJsonX6ff66047
import com.nabobery.sdkgen.github.generated.InlineGistsCommentsPostRequestJsonXd58f369a
import com.nabobery.sdkgen.github.generated.InlineGistsPatchRequestJsonX8eb6f884
import com.nabobery.sdkgen.github.generated.InlineGistsPostRequestJsonXf7577ba9
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.ValidationError
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.JsonObject

internal object GistsCodecs {
  private val gistsCheckIsStarredResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/check-is-starred.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsCheckIsStarredResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsCheckIsStarredResponseCodecAlternative2Codec)

  private val gistsCheckIsStarredResponseCodecAlternative3Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("gists/check-is-starred.response.alternative3", JsonObject.serializer(), SdkJson)

  internal val gistsCheckIsStarredResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(gistsCheckIsStarredResponseCodecAlternative3Codec)

  internal val gistsCheckIsStarredRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsCheckIsStarredResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val GISTSCREATE_REQUEST_CODEC_ID: String = "gists/create.request"

  private val gistsCreateRequestCodec: MediaTypeCodec<InlineGistsPostRequestJsonXf7577ba9> =
      KotlinxSerializationCodec(GISTSCREATE_REQUEST_CODEC_ID, InlineGistsPostRequestJsonXf7577ba9.Serializer, SdkJson)

  internal const val GISTSCREATE_RESPONSE_CODEC_ID: String = "gists/create.response"

  private val gistsCreateResponseCodec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec(GISTSCREATE_RESPONSE_CODEC_ID, GistSimple.Serializer, SdkJson)

  private val gistsCreateResponseCodecAlternative0Codec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec("gists/create.response.alternative0", GistSimple.Serializer, SdkJson)

  internal val gistsCreateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsCreateResponseCodecAlternative0Codec)

  private val gistsCreateResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/create.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsCreateResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsCreateResponseCodecAlternative2Codec)

  private val gistsCreateResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/create.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsCreateResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsCreateResponseCodecAlternative3Codec)

  private val gistsCreateResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/create.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val gistsCreateResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gistsCreateResponseCodecAlternative4Codec)

  internal val gistsCreateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineGistsPostRequestJsonXf7577ba9> =
      MediaTypeCodecRegistry.of(gistsCreateRequestCodec)

  internal val gistsCreateResponseCodecRegistry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsCreateResponseCodec)

  internal const val GISTSCREATECOMMENT_REQUEST_CODEC_ID: String = "gists/create-comment.request"

  private val gistsCreateCommentRequestCodec:
      MediaTypeCodec<InlineGistsCommentsPostRequestJsonXd58f369a> =
      KotlinxSerializationCodec(GISTSCREATECOMMENT_REQUEST_CODEC_ID, InlineGistsCommentsPostRequestJsonXd58f369a.Serializer, SdkJson)

  internal const val GISTSCREATECOMMENT_RESPONSE_CODEC_ID: String = "gists/create-comment.response"

  private val gistsCreateCommentResponseCodec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec(GISTSCREATECOMMENT_RESPONSE_CODEC_ID, GistComment.Serializer, SdkJson)

  private val gistsCreateCommentResponseCodecAlternative0Codec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec("gists/create-comment.response.alternative0", GistComment.Serializer, SdkJson)

  internal val gistsCreateCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GistComment> =
      MediaTypeCodecRegistry.of(gistsCreateCommentResponseCodecAlternative0Codec)

  private val gistsCreateCommentResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/create-comment.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsCreateCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsCreateCommentResponseCodecAlternative2Codec)

  private val gistsCreateCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/create-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsCreateCommentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsCreateCommentResponseCodecAlternative3Codec)

  internal val gistsCreateCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineGistsCommentsPostRequestJsonXd58f369a> =
      MediaTypeCodecRegistry.of(gistsCreateCommentRequestCodec)

  internal val gistsCreateCommentResponseCodecRegistry: MediaTypeCodecRegistry<GistComment> =
      MediaTypeCodecRegistry.of(gistsCreateCommentResponseCodec)

  private val gistsDeleteResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/delete.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsDeleteResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsDeleteResponseCodecAlternative2Codec)

  private val gistsDeleteResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/delete.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsDeleteResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsDeleteResponseCodecAlternative3Codec)

  internal val gistsDeleteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsDeleteResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val gistsDeleteCommentResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/delete-comment.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsDeleteCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsDeleteCommentResponseCodecAlternative2Codec)

  private val gistsDeleteCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/delete-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsDeleteCommentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsDeleteCommentResponseCodecAlternative3Codec)

  internal val gistsDeleteCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsDeleteCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val GISTSFORK_RESPONSE_CODEC_ID: String = "gists/fork.response"

  private val gistsForkResponseCodec: MediaTypeCodec<BaseGist> =
      KotlinxSerializationCodec(GISTSFORK_RESPONSE_CODEC_ID, BaseGist.Serializer, SdkJson)

  private val gistsForkResponseCodecAlternative0Codec: MediaTypeCodec<BaseGist> =
      KotlinxSerializationCodec("gists/fork.response.alternative0", BaseGist.Serializer, SdkJson)

  internal val gistsForkResponseCodecAlternative0Registry: MediaTypeCodecRegistry<BaseGist> =
      MediaTypeCodecRegistry.of(gistsForkResponseCodecAlternative0Codec)

  private val gistsForkResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/fork.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsForkResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsForkResponseCodecAlternative2Codec)

  private val gistsForkResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/fork.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsForkResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsForkResponseCodecAlternative3Codec)

  private val gistsForkResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/fork.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val gistsForkResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gistsForkResponseCodecAlternative4Codec)

  internal val gistsForkRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsForkResponseCodecRegistry: MediaTypeCodecRegistry<BaseGist> =
      MediaTypeCodecRegistry.of(gistsForkResponseCodec)

  internal const val GISTSGET_RESPONSE_CODEC_ID: String = "gists/get.response"

  private val gistsGetResponseCodec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec(GISTSGET_RESPONSE_CODEC_ID, GistSimple.Serializer, SdkJson)

  private val gistsGetResponseCodecAlternative0Codec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec("gists/get.response.alternative0", GistSimple.Serializer, SdkJson)

  internal val gistsGetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsGetResponseCodecAlternative0Codec)

  private val gistsGetResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineForbiddenGistResponseJsonX346772b5> =
      KotlinxSerializationCodec("gists/get.response.alternative2", InlineForbiddenGistResponseJsonX346772b5.Serializer, SdkJson)

  internal val gistsGetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineForbiddenGistResponseJsonX346772b5> =
      MediaTypeCodecRegistry.of(gistsGetResponseCodecAlternative2Codec)

  private val gistsGetResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/get.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsGetResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsGetResponseCodecAlternative3Codec)

  internal val gistsGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsGetResponseCodecRegistry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsGetResponseCodec)

  internal const val GISTSGETCOMMENT_RESPONSE_CODEC_ID: String = "gists/get-comment.response"

  private val gistsGetCommentResponseCodec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec(GISTSGETCOMMENT_RESPONSE_CODEC_ID, GistComment.Serializer, SdkJson)

  private val gistsGetCommentResponseCodecAlternative0Codec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec("gists/get-comment.response.alternative0", GistComment.Serializer, SdkJson)

  internal val gistsGetCommentResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GistComment>
      = MediaTypeCodecRegistry.of(gistsGetCommentResponseCodecAlternative0Codec)

  private val gistsGetCommentResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineForbiddenGistResponseJsonX346772b5> =
      KotlinxSerializationCodec("gists/get-comment.response.alternative2", InlineForbiddenGistResponseJsonX346772b5.Serializer, SdkJson)

  internal val gistsGetCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineForbiddenGistResponseJsonX346772b5> =
      MediaTypeCodecRegistry.of(gistsGetCommentResponseCodecAlternative2Codec)

  private val gistsGetCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/get-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsGetCommentResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsGetCommentResponseCodecAlternative3Codec)

  internal val gistsGetCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsGetCommentResponseCodecRegistry: MediaTypeCodecRegistry<GistComment> =
      MediaTypeCodecRegistry.of(gistsGetCommentResponseCodec)

  internal const val GISTSGETREVISION_RESPONSE_CODEC_ID: String = "gists/get-revision.response"

  private val gistsGetRevisionResponseCodec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec(GISTSGETREVISION_RESPONSE_CODEC_ID, GistSimple.Serializer, SdkJson)

  private val gistsGetRevisionResponseCodecAlternative0Codec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec("gists/get-revision.response.alternative0", GistSimple.Serializer, SdkJson)

  internal val gistsGetRevisionResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GistSimple>
      = MediaTypeCodecRegistry.of(gistsGetRevisionResponseCodecAlternative0Codec)

  private val gistsGetRevisionResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/get-revision.response.alternative1", BasicError.Serializer, SdkJson)

  internal val gistsGetRevisionResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsGetRevisionResponseCodecAlternative1Codec)

  private val gistsGetRevisionResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/get-revision.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsGetRevisionResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsGetRevisionResponseCodecAlternative2Codec)

  private val gistsGetRevisionResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/get-revision.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val gistsGetRevisionResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gistsGetRevisionResponseCodecAlternative3Codec)

  internal val gistsGetRevisionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsGetRevisionResponseCodecRegistry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsGetRevisionResponseCodec)

  internal const val GISTSLIST_RESPONSE_CODEC_ID: String = "gists/list.response"

  private val gistsListResponseCodec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec(GISTSLIST_RESPONSE_CODEC_ID, ListSerializer(BaseGist.Serializer), SdkJson)

  private val gistsListResponseCodecAlternative0Codec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec("gists/list.response.alternative0", ListSerializer(BaseGist.Serializer), SdkJson)

  internal val gistsListResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListResponseCodecAlternative0Codec)

  private val gistsListResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsListResponseCodecAlternative2Codec)

  internal val gistsListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListResponseCodecRegistry: MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListResponseCodec)

  internal const val GISTSLISTCOMMENTS_RESPONSE_CODEC_ID: String = "gists/list-comments.response"

  private val gistsListCommentsResponseCodec: MediaTypeCodec<List<GistComment>> =
      KotlinxSerializationCodec(GISTSLISTCOMMENTS_RESPONSE_CODEC_ID, ListSerializer(GistComment.Serializer), SdkJson)

  private val gistsListCommentsResponseCodecAlternative0Codec: MediaTypeCodec<List<GistComment>> =
      KotlinxSerializationCodec("gists/list-comments.response.alternative0", ListSerializer(GistComment.Serializer), SdkJson)

  internal val gistsListCommentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GistComment>> =
      MediaTypeCodecRegistry.of(gistsListCommentsResponseCodecAlternative0Codec)

  private val gistsListCommentsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-comments.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListCommentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsListCommentsResponseCodecAlternative2Codec)

  private val gistsListCommentsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-comments.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsListCommentsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsListCommentsResponseCodecAlternative3Codec)

  internal val gistsListCommentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListCommentsResponseCodecRegistry: MediaTypeCodecRegistry<List<GistComment>> =
      MediaTypeCodecRegistry.of(gistsListCommentsResponseCodec)

  internal const val GISTSLISTCOMMITS_RESPONSE_CODEC_ID: String = "gists/list-commits.response"

  private val gistsListCommitsResponseCodec: MediaTypeCodec<List<GistCommit>> =
      KotlinxSerializationCodec(GISTSLISTCOMMITS_RESPONSE_CODEC_ID, ListSerializer(GistCommit.Serializer), SdkJson)

  private val gistsListCommitsResponseCodecAlternative0Codec: MediaTypeCodec<List<GistCommit>> =
      KotlinxSerializationCodec("gists/list-commits.response.alternative0", ListSerializer(GistCommit.Serializer), SdkJson)

  internal val gistsListCommitsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GistCommit>> =
      MediaTypeCodecRegistry.of(gistsListCommitsResponseCodecAlternative0Codec)

  private val gistsListCommitsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-commits.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListCommitsResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsListCommitsResponseCodecAlternative2Codec)

  private val gistsListCommitsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-commits.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsListCommitsResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsListCommitsResponseCodecAlternative3Codec)

  internal val gistsListCommitsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListCommitsResponseCodecRegistry: MediaTypeCodecRegistry<List<GistCommit>> =
      MediaTypeCodecRegistry.of(gistsListCommitsResponseCodec)

  internal const val GISTSLISTFORUSER_RESPONSE_CODEC_ID: String = "gists/list-for-user.response"

  private val gistsListForUserResponseCodec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec(GISTSLISTFORUSER_RESPONSE_CODEC_ID, ListSerializer(BaseGist.Serializer), SdkJson)

  private val gistsListForUserResponseCodecAlternative0Codec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec("gists/list-for-user.response.alternative0", ListSerializer(BaseGist.Serializer), SdkJson)

  internal val gistsListForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListForUserResponseCodecAlternative0Codec)

  private val gistsListForUserResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/list-for-user.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val gistsListForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gistsListForUserResponseCodecAlternative1Codec)

  internal val gistsListForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListForUserResponseCodecRegistry: MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListForUserResponseCodec)

  internal const val GISTSLISTFORKS_RESPONSE_CODEC_ID: String = "gists/list-forks.response"

  private val gistsListForksResponseCodec: MediaTypeCodec<List<GistSimple>> =
      KotlinxSerializationCodec(GISTSLISTFORKS_RESPONSE_CODEC_ID, ListSerializer(GistSimple.Serializer), SdkJson)

  private val gistsListForksResponseCodecAlternative0Codec: MediaTypeCodec<List<GistSimple>> =
      KotlinxSerializationCodec("gists/list-forks.response.alternative0", ListSerializer(GistSimple.Serializer), SdkJson)

  internal val gistsListForksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GistSimple>> =
      MediaTypeCodecRegistry.of(gistsListForksResponseCodecAlternative0Codec)

  private val gistsListForksResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-forks.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListForksResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsListForksResponseCodecAlternative2Codec)

  private val gistsListForksResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-forks.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsListForksResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsListForksResponseCodecAlternative3Codec)

  internal val gistsListForksRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListForksResponseCodecRegistry: MediaTypeCodecRegistry<List<GistSimple>> =
      MediaTypeCodecRegistry.of(gistsListForksResponseCodec)

  internal const val GISTSLISTPUBLIC_RESPONSE_CODEC_ID: String = "gists/list-public.response"

  private val gistsListPublicResponseCodec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec(GISTSLISTPUBLIC_RESPONSE_CODEC_ID, ListSerializer(BaseGist.Serializer), SdkJson)

  private val gistsListPublicResponseCodecAlternative0Codec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec("gists/list-public.response.alternative0", ListSerializer(BaseGist.Serializer), SdkJson)

  internal val gistsListPublicResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListPublicResponseCodecAlternative0Codec)

  private val gistsListPublicResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-public.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListPublicResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsListPublicResponseCodecAlternative2Codec)

  private val gistsListPublicResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/list-public.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val gistsListPublicResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gistsListPublicResponseCodecAlternative3Codec)

  internal val gistsListPublicRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListPublicResponseCodecRegistry: MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListPublicResponseCodec)

  internal const val GISTSLISTSTARRED_RESPONSE_CODEC_ID: String = "gists/list-starred.response"

  private val gistsListStarredResponseCodec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec(GISTSLISTSTARRED_RESPONSE_CODEC_ID, ListSerializer(BaseGist.Serializer), SdkJson)

  private val gistsListStarredResponseCodecAlternative0Codec: MediaTypeCodec<List<BaseGist>> =
      KotlinxSerializationCodec("gists/list-starred.response.alternative0", ListSerializer(BaseGist.Serializer), SdkJson)

  internal val gistsListStarredResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListStarredResponseCodecAlternative0Codec)

  private val gistsListStarredResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-starred.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsListStarredResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsListStarredResponseCodecAlternative2Codec)

  private val gistsListStarredResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/list-starred.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsListStarredResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(gistsListStarredResponseCodecAlternative3Codec)

  internal val gistsListStarredRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsListStarredResponseCodecRegistry: MediaTypeCodecRegistry<List<BaseGist>> =
      MediaTypeCodecRegistry.of(gistsListStarredResponseCodec)

  private val gistsStarResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/star.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsStarResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsStarResponseCodecAlternative2Codec)

  private val gistsStarResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/star.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsStarResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsStarResponseCodecAlternative3Codec)

  internal val gistsStarRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsStarResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val gistsUnstarResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/unstar.response.alternative2", BasicError.Serializer, SdkJson)

  internal val gistsUnstarResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsUnstarResponseCodecAlternative2Codec)

  private val gistsUnstarResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/unstar.response.alternative3", BasicError.Serializer, SdkJson)

  internal val gistsUnstarResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsUnstarResponseCodecAlternative3Codec)

  internal val gistsUnstarRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gistsUnstarResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val GISTSUPDATE_REQUEST_CODEC_ID: String = "gists/update.request"

  private val gistsUpdateRequestCodec: MediaTypeCodec<InlineGistsPatchRequestJsonX8eb6f884?> =
      KotlinxSerializationCodec(GISTSUPDATE_REQUEST_CODEC_ID, InlineGistsPatchRequestJsonX8eb6f884.Serializer.nullable, SdkJson)

  internal const val GISTSUPDATE_RESPONSE_CODEC_ID: String = "gists/update.response"

  private val gistsUpdateResponseCodec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec(GISTSUPDATE_RESPONSE_CODEC_ID, GistSimple.Serializer, SdkJson)

  private val gistsUpdateResponseCodecAlternative0Codec: MediaTypeCodec<GistSimple> =
      KotlinxSerializationCodec("gists/update.response.alternative0", GistSimple.Serializer, SdkJson)

  internal val gistsUpdateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsUpdateResponseCodecAlternative0Codec)

  private val gistsUpdateResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/update.response.alternative1", BasicError.Serializer, SdkJson)

  internal val gistsUpdateResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsUpdateResponseCodecAlternative1Codec)

  private val gistsUpdateResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("gists/update.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val gistsUpdateResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gistsUpdateResponseCodecAlternative2Codec)

  internal val gistsUpdateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineGistsPatchRequestJsonX8eb6f884?> =
      MediaTypeCodecRegistry.of(gistsUpdateRequestCodec)

  internal val gistsUpdateResponseCodecRegistry: MediaTypeCodecRegistry<GistSimple> =
      MediaTypeCodecRegistry.of(gistsUpdateResponseCodec)

  internal const val GISTSUPDATECOMMENT_REQUEST_CODEC_ID: String = "gists/update-comment.request"

  private val gistsUpdateCommentRequestCodec:
      MediaTypeCodec<InlineGistsCommentsPatchRequestJsonX6ff66047> =
      KotlinxSerializationCodec(GISTSUPDATECOMMENT_REQUEST_CODEC_ID, InlineGistsCommentsPatchRequestJsonX6ff66047.Serializer, SdkJson)

  internal const val GISTSUPDATECOMMENT_RESPONSE_CODEC_ID: String = "gists/update-comment.response"

  private val gistsUpdateCommentResponseCodec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec(GISTSUPDATECOMMENT_RESPONSE_CODEC_ID, GistComment.Serializer, SdkJson)

  private val gistsUpdateCommentResponseCodecAlternative0Codec: MediaTypeCodec<GistComment> =
      KotlinxSerializationCodec("gists/update-comment.response.alternative0", GistComment.Serializer, SdkJson)

  internal val gistsUpdateCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GistComment> =
      MediaTypeCodecRegistry.of(gistsUpdateCommentResponseCodecAlternative0Codec)

  private val gistsUpdateCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("gists/update-comment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val gistsUpdateCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gistsUpdateCommentResponseCodecAlternative1Codec)

  internal val gistsUpdateCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineGistsCommentsPatchRequestJsonX6ff66047> =
      MediaTypeCodecRegistry.of(gistsUpdateCommentRequestCodec)

  internal val gistsUpdateCommentResponseCodecRegistry: MediaTypeCodecRegistry<GistComment> =
      MediaTypeCodecRegistry.of(gistsUpdateCommentResponseCodec)
}

/**
 * Client for the 'gists' group of GitHub v3 REST API.
 */
public class GistsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@GistsClient.authentication)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return No response body.
   * @throws GistsCheckIsStarredApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GistsCheckIsStarredError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsCheckIsStarred(gistId: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, GistsCheckIsStarredResponse, Unit>(
    request = SdkExecutionRequest(gistsCheckIsStarredMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsCheckIsStarredRequestCodecRegistry,
    responseDecoder = GistsCheckIsStarredResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsCheckIsStarredResponse.SuccessNoContent -> response.unit
        is GistsCheckIsStarredResponse.Http304NoContent -> response.unit
        is GistsCheckIsStarredResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCheckIsStarredResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCheckIsStarredResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsCheckIsStarredResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GistsCheckIsStarredResponse.Http304NoContent -> GistsCheckIsStarredApiException(response, statusCode, headers)
        is GistsCheckIsStarredResponse.Http403Json -> GistsCheckIsStarredApiException(response, statusCode, headers)
        is GistsCheckIsStarredResponse.Http404Json -> GistsCheckIsStarredApiException(response, statusCode, headers)
        is GistsCheckIsStarredResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsCheckIsStarredWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsCheckIsStarredResponse> = executor.executeWithResponse<Unit, GistsCheckIsStarredResponse>(SdkExecutionRequest(gistsCheckIsStarredMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsCheckIsStarredRequestCodecRegistry, GistsCheckIsStarredResponseDecoder, options)

  /**
   * Allows you to add a new gist with one or more files.
   *
   * > [!NOTE]
   * > Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that
   * Gist uses internally.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsCreateApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsCreateError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsCreate(request: InlineGistsPostRequestJsonXf7577ba9, options: CallOptions = CallOptions()): GistSimple = executor.executeWithTypedErrors<InlineGistsPostRequestJsonXf7577ba9, GistsCreateResponse, GistSimple>(
    request = SdkExecutionRequest(gistsCreateMetadata, baseUri, request, listOf(GistsCodecs.GISTSCREATE_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = GistsCodecs.gistsCreateRequestCodecRegistry,
    responseDecoder = GistsCreateResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsCreateResponse.SuccessJson -> response.json
        is GistsCreateResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsCreateResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsCreateResponse.Http304NoContent -> GistsCreateApiException(response, statusCode, headers)
        is GistsCreateResponse.Http403Json -> GistsCreateApiException(response, statusCode, headers)
        is GistsCreateResponse.Http404Json -> GistsCreateApiException(response, statusCode, headers)
        is GistsCreateResponse.Http422Json -> GistsCreateApiException(response, statusCode, headers)
        is GistsCreateResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Allows you to add a new gist with one or more files.
   *
   * > [!NOTE]
   * > Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that
   * Gist uses internally.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun gistsCreateWithResponse(request: InlineGistsPostRequestJsonXf7577ba9, options: CallOptions = CallOptions()): SdkResponseResult<GistsCreateResponse> = executor.executeWithResponse<InlineGistsPostRequestJsonXf7577ba9, GistsCreateResponse>(SdkExecutionRequest(gistsCreateMetadata, baseUri, request, listOf(GistsCodecs.GISTSCREATE_REQUEST_CODEC_ID), emptyList()), GistsCodecs.gistsCreateRequestCodecRegistry, GistsCreateResponseDecoder, options)

  /**
   * Creates a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param request Request body sent to the operation.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsCreateCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GistsCreateCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsCreateComment(
    request: InlineGistsCommentsPostRequestJsonXd58f369a,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): GistComment = executor.executeWithTypedErrors<InlineGistsCommentsPostRequestJsonXd58f369a, GistsCreateCommentResponse, GistComment>(
    request = SdkExecutionRequest(gistsCreateCommentMetadata, baseUri, request, listOf(GistsCodecs.GISTSCREATECOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsCreateCommentRequestCodecRegistry,
    responseDecoder = GistsCreateCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsCreateCommentResponse.SuccessJson -> response.json
        is GistsCreateCommentResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsCreateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsCreateCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsCreateCommentResponse.Http304NoContent -> GistsCreateCommentApiException(response, statusCode, headers)
        is GistsCreateCommentResponse.Http403Json -> GistsCreateCommentApiException(response, statusCode, headers)
        is GistsCreateCommentResponse.Http404Json -> GistsCreateCommentApiException(response, statusCode, headers)
        is GistsCreateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsCreateCommentWithResponse(
    request: InlineGistsCommentsPostRequestJsonXd58f369a,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsCreateCommentResponse> = executor.executeWithResponse<InlineGistsCommentsPostRequestJsonXd58f369a, GistsCreateCommentResponse>(SdkExecutionRequest(gistsCreateCommentMetadata, baseUri, request, listOf(GistsCodecs.GISTSCREATECOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsCreateCommentRequestCodecRegistry, GistsCreateCommentResponseDecoder, options)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return No response body.
   * @throws GistsDeleteApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsDeleteError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsDelete(gistId: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, GistsDeleteResponse, Unit>(
    request = SdkExecutionRequest(gistsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsDeleteRequestCodecRegistry,
    responseDecoder = GistsDeleteResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsDeleteResponse.SuccessNoContent -> response.unit
        is GistsDeleteResponse.Http304NoContent -> response.unit
        is GistsDeleteResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsDeleteResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsDeleteResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsDeleteResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GistsDeleteResponse.Http304NoContent -> GistsDeleteApiException(response, statusCode, headers)
        is GistsDeleteResponse.Http403Json -> GistsDeleteApiException(response, statusCode, headers)
        is GistsDeleteResponse.Http404Json -> GistsDeleteApiException(response, statusCode, headers)
        is GistsDeleteResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsDeleteWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsDeleteResponse> = executor.executeWithResponse<Unit, GistsDeleteResponse>(SdkExecutionRequest(gistsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsDeleteRequestCodecRegistry, GistsDeleteResponseDecoder, options)

  /**
   *
   *
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return No response body.
   * @throws GistsDeleteCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GistsDeleteCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsDeleteComment(
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, GistsDeleteCommentResponse, Unit>(
    request = SdkExecutionRequest(gistsDeleteCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsDeleteCommentRequestCodecRegistry,
    responseDecoder = GistsDeleteCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsDeleteCommentResponse.SuccessNoContent -> response.unit
        is GistsDeleteCommentResponse.Http304NoContent -> response.unit
        is GistsDeleteCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsDeleteCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsDeleteCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsDeleteCommentResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GistsDeleteCommentResponse.Http304NoContent -> GistsDeleteCommentApiException(response, statusCode, headers)
        is GistsDeleteCommentResponse.Http403Json -> GistsDeleteCommentApiException(response, statusCode, headers)
        is GistsDeleteCommentResponse.Http404Json -> GistsDeleteCommentApiException(response, statusCode, headers)
        is GistsDeleteCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsDeleteCommentWithResponse(
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsDeleteCommentResponse> = executor.executeWithResponse<Unit, GistsDeleteCommentResponse>(SdkExecutionRequest(gistsDeleteCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsDeleteCommentRequestCodecRegistry, GistsDeleteCommentResponseDecoder, options)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsForkApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsForkError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsFork(gistId: String, options: CallOptions = CallOptions()): BaseGist = executor.executeWithTypedErrors<Unit, GistsForkResponse, BaseGist>(
    request = SdkExecutionRequest(gistsForkMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsForkRequestCodecRegistry,
    responseDecoder = GistsForkResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsForkResponse.SuccessJson -> response.json
        is GistsForkResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsForkResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsForkResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsForkResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsForkResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsForkResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsForkResponse.Http304NoContent -> GistsForkApiException(response, statusCode, headers)
        is GistsForkResponse.Http403Json -> GistsForkApiException(response, statusCode, headers)
        is GistsForkResponse.Http404Json -> GistsForkApiException(response, statusCode, headers)
        is GistsForkResponse.Http422Json -> GistsForkApiException(response, statusCode, headers)
        is GistsForkResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsForkWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsForkResponse> = executor.executeWithResponse<Unit, GistsForkResponse>(SdkExecutionRequest(gistsForkMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsForkRequestCodecRegistry, GistsForkResponseDecoder, options)

  /**
   * Gets a specified gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsGetApiException When the service returns a declared non-success response; its `error` property exposes
   * the decoded GistsGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsGet(gistId: String, options: CallOptions = CallOptions()): GistSimple = executor.executeWithTypedErrors<Unit, GistsGetResponse, GistSimple>(
    request = SdkExecutionRequest(gistsGetMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsGetRequestCodecRegistry,
    responseDecoder = GistsGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsGetResponse.SuccessJson -> response.json
        is GistsGetResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsGetResponse.Http304NoContent -> GistsGetApiException(response, statusCode, headers)
        is GistsGetResponse.Http403Json -> GistsGetApiException(response, statusCode, headers)
        is GistsGetResponse.Http404Json -> GistsGetApiException(response, statusCode, headers)
        is GistsGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a specified gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsGetWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsGetResponse> = executor.executeWithResponse<Unit, GistsGetResponse>(SdkExecutionRequest(gistsGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsGetRequestCodecRegistry, GistsGetResponseDecoder, options)

  /**
   * Gets a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsGetCommentApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsGetCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsGetComment(
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): GistComment = executor.executeWithTypedErrors<Unit, GistsGetCommentResponse, GistComment>(
    request = SdkExecutionRequest(gistsGetCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsGetCommentRequestCodecRegistry,
    responseDecoder = GistsGetCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsGetCommentResponse.SuccessJson -> response.json
        is GistsGetCommentResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsGetCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsGetCommentResponse.Http304NoContent -> GistsGetCommentApiException(response, statusCode, headers)
        is GistsGetCommentResponse.Http403Json -> GistsGetCommentApiException(response, statusCode, headers)
        is GistsGetCommentResponse.Http404Json -> GistsGetCommentApiException(response, statusCode, headers)
        is GistsGetCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsGetCommentWithResponse(
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsGetCommentResponse> = executor.executeWithResponse<Unit, GistsGetCommentResponse>(SdkExecutionRequest(gistsGetCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsGetCommentRequestCodecRegistry, GistsGetCommentResponseDecoder, options)

  /**
   * Gets a specified gist revision.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param gistId The unique identifier of the gist.
   * @param sha Wire parameter `sha`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsGetRevisionApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsGetRevisionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsGetRevision(
    gistId: String,
    sha: String,
    options: CallOptions = CallOptions(),
  ): GistSimple = executor.executeWithTypedErrors<Unit, GistsGetRevisionResponse, GistSimple>(
    request = SdkExecutionRequest(gistsGetRevisionMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sha", values = listOf(sha.toString())))
    }),
    requestCodecs = GistsCodecs.gistsGetRevisionRequestCodecRegistry,
    responseDecoder = GistsGetRevisionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsGetRevisionResponse.SuccessJson -> response.json
        is GistsGetRevisionResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetRevisionResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetRevisionResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsGetRevisionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsGetRevisionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsGetRevisionResponse.Http403Json -> GistsGetRevisionApiException(response, statusCode, headers)
        is GistsGetRevisionResponse.Http404Json -> GistsGetRevisionApiException(response, statusCode, headers)
        is GistsGetRevisionResponse.Http422Json -> GistsGetRevisionApiException(response, statusCode, headers)
        is GistsGetRevisionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a specified gist revision.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param sha Wire parameter `sha`.
   * @param options Execution options.
   */
  public suspend fun gistsGetRevisionWithResponse(
    gistId: String,
    sha: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsGetRevisionResponse> = executor.executeWithResponse<Unit, GistsGetRevisionResponse>(SdkExecutionRequest(gistsGetRevisionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sha", values = listOf(sha.toString())))
  }), GistsCodecs.gistsGetRevisionRequestCodecRegistry, GistsGetRevisionResponseDecoder, options)

  /**
   * Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsList(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<BaseGist> = executor.executeWithTypedErrors<Unit, GistsListResponse, List<BaseGist>>(
    request = SdkExecutionRequest(gistsListMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListRequestCodecRegistry,
    responseDecoder = GistsListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListResponse.SuccessJson -> response.json
        is GistsListResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListResponse.Http304NoContent -> GistsListApiException(response, statusCode, headers)
        is GistsListResponse.Http403Json -> GistsListApiException(response, statusCode, headers)
        is GistsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun gistsListWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListResponse> = executor.executeWithResponse<Unit, GistsListResponse>(SdkExecutionRequest(gistsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListRequestCodecRegistry, GistsListResponseDecoder, options)

  /**
   * Lists the comments on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListCommentsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GistsListCommentsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListComments(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<GistComment> = executor.executeWithTypedErrors<Unit, GistsListCommentsResponse, List<GistComment>>(
    request = SdkExecutionRequest(gistsListCommentsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListCommentsRequestCodecRegistry,
    responseDecoder = GistsListCommentsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListCommentsResponse.SuccessJson -> response.json
        is GistsListCommentsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommentsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommentsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommentsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListCommentsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListCommentsResponse.Http304NoContent -> GistsListCommentsApiException(response, statusCode, headers)
        is GistsListCommentsResponse.Http403Json -> GistsListCommentsApiException(response, statusCode, headers)
        is GistsListCommentsResponse.Http404Json -> GistsListCommentsApiException(response, statusCode, headers)
        is GistsListCommentsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the comments on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun gistsListCommentsWithResponse(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListCommentsResponse> = executor.executeWithResponse<Unit, GistsListCommentsResponse>(SdkExecutionRequest(gistsListCommentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListCommentsRequestCodecRegistry, GistsListCommentsResponseDecoder, options)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListCommitsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListCommitsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListCommits(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<GistCommit> = executor.executeWithTypedErrors<Unit, GistsListCommitsResponse, List<GistCommit>>(
    request = SdkExecutionRequest(gistsListCommitsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListCommitsRequestCodecRegistry,
    responseDecoder = GistsListCommitsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListCommitsResponse.SuccessJson -> response.json
        is GistsListCommitsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommitsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommitsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListCommitsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListCommitsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListCommitsResponse.Http304NoContent -> GistsListCommitsApiException(response, statusCode, headers)
        is GistsListCommitsResponse.Http403Json -> GistsListCommitsApiException(response, statusCode, headers)
        is GistsListCommitsResponse.Http404Json -> GistsListCommitsApiException(response, statusCode, headers)
        is GistsListCommitsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun gistsListCommitsWithResponse(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListCommitsResponse> = executor.executeWithResponse<Unit, GistsListCommitsResponse>(SdkExecutionRequest(gistsListCommitsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListCommitsRequestCodecRegistry, GistsListCommitsResponseDecoder, options)

  /**
   * Lists public gists for the specified user:
   *
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListForUserApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<BaseGist> = executor.executeWithTypedErrors<Unit, GistsListForUserResponse, List<BaseGist>>(
    request = SdkExecutionRequest(gistsListForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListForUserRequestCodecRegistry,
    responseDecoder = GistsListForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListForUserResponse.SuccessJson -> response.json
        is GistsListForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListForUserResponse.Http422Json -> GistsListForUserApiException(response, statusCode, headers)
        is GistsListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists public gists for the specified user:
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun gistsListForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListForUserResponse> = executor.executeWithResponse<Unit, GistsListForUserResponse>(SdkExecutionRequest(gistsListForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListForUserRequestCodecRegistry, GistsListForUserResponseDecoder, options)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListForksApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListForksError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListForks(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<GistSimple> = executor.executeWithTypedErrors<Unit, GistsListForksResponse, List<GistSimple>>(
    request = SdkExecutionRequest(gistsListForksMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListForksRequestCodecRegistry,
    responseDecoder = GistsListForksResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListForksResponse.SuccessJson -> response.json
        is GistsListForksResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListForksResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListForksResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListForksResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListForksResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListForksResponse.Http304NoContent -> GistsListForksApiException(response, statusCode, headers)
        is GistsListForksResponse.Http403Json -> GistsListForksApiException(response, statusCode, headers)
        is GistsListForksResponse.Http404Json -> GistsListForksApiException(response, statusCode, headers)
        is GistsListForksResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun gistsListForksWithResponse(
    gistId: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListForksResponse> = executor.executeWithResponse<Unit, GistsListForksResponse>(SdkExecutionRequest(gistsListForksMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListForksRequestCodecRegistry, GistsListForksResponseDecoder, options)

  /**
   * List public gists sorted by most recently updated to least recently updated.
   *
   * Note: With [pagination](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api), you can fetch up to
   * 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListPublicApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListPublicError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListPublic(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<BaseGist> = executor.executeWithTypedErrors<Unit, GistsListPublicResponse, List<BaseGist>>(
    request = SdkExecutionRequest(gistsListPublicMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListPublicRequestCodecRegistry,
    responseDecoder = GistsListPublicResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListPublicResponse.SuccessJson -> response.json
        is GistsListPublicResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListPublicResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListPublicResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListPublicResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListPublicResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListPublicResponse.Http304NoContent -> GistsListPublicApiException(response, statusCode, headers)
        is GistsListPublicResponse.Http403Json -> GistsListPublicApiException(response, statusCode, headers)
        is GistsListPublicResponse.Http422Json -> GistsListPublicApiException(response, statusCode, headers)
        is GistsListPublicResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List public gists sorted by most recently updated to least recently updated.
   *
   * Note: With [pagination](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api), you can fetch up to
   * 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun gistsListPublicWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListPublicResponse> = executor.executeWithResponse<Unit, GistsListPublicResponse>(SdkExecutionRequest(gistsListPublicMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListPublicRequestCodecRegistry, GistsListPublicResponseDecoder, options)

  /**
   * List the authenticated user's starred gists:
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsListStarredApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsListStarredError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsListStarred(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<BaseGist> = executor.executeWithTypedErrors<Unit, GistsListStarredResponse, List<BaseGist>>(
    request = SdkExecutionRequest(gistsListStarredMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GistsCodecs.gistsListStarredRequestCodecRegistry,
    responseDecoder = GistsListStarredResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsListStarredResponse.SuccessJson -> response.json
        is GistsListStarredResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GistsListStarredResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListStarredResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsListStarredResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsListStarredResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsListStarredResponse.Http304NoContent -> GistsListStarredApiException(response, statusCode, headers)
        is GistsListStarredResponse.Http401Json -> GistsListStarredApiException(response, statusCode, headers)
        is GistsListStarredResponse.Http403Json -> GistsListStarredApiException(response, statusCode, headers)
        is GistsListStarredResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the authenticated user's starred gists:
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun gistsListStarredWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsListStarredResponse> = executor.executeWithResponse<Unit, GistsListStarredResponse>(SdkExecutionRequest(gistsListStarredMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), GistsCodecs.gistsListStarredRequestCodecRegistry, GistsListStarredResponseDecoder, options)

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return No response body.
   * @throws GistsStarApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsStarError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsStar(gistId: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, GistsStarResponse, Unit>(
    request = SdkExecutionRequest(gistsStarMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsStarRequestCodecRegistry,
    responseDecoder = GistsStarResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsStarResponse.SuccessNoContent -> response.unit
        is GistsStarResponse.Http304NoContent -> response.unit
        is GistsStarResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsStarResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsStarResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsStarResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GistsStarResponse.Http304NoContent -> GistsStarApiException(response, statusCode, headers)
        is GistsStarResponse.Http403Json -> GistsStarApiException(response, statusCode, headers)
        is GistsStarResponse.Http404Json -> GistsStarApiException(response, statusCode, headers)
        is GistsStarResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsStarWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsStarResponse> = executor.executeWithResponse<Unit, GistsStarResponse>(SdkExecutionRequest(gistsStarMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsStarRequestCodecRegistry, GistsStarResponseDecoder, options)

  /**
   *
   *
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return No response body.
   * @throws GistsUnstarApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsUnstarError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsUnstar(gistId: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, GistsUnstarResponse, Unit>(
    request = SdkExecutionRequest(gistsUnstarMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsUnstarRequestCodecRegistry,
    responseDecoder = GistsUnstarResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsUnstarResponse.SuccessNoContent -> response.unit
        is GistsUnstarResponse.Http304NoContent -> response.unit
        is GistsUnstarResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsUnstarResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsUnstarResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsUnstarResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GistsUnstarResponse.Http304NoContent -> GistsUnstarApiException(response, statusCode, headers)
        is GistsUnstarResponse.Http403Json -> GistsUnstarApiException(response, statusCode, headers)
        is GistsUnstarResponse.Http404Json -> GistsUnstarApiException(response, statusCode, headers)
        is GistsUnstarResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsUnstarWithResponse(gistId: String, options: CallOptions = CallOptions()): SdkResponseResult<GistsUnstarResponse> = executor.executeWithResponse<Unit, GistsUnstarResponse>(SdkExecutionRequest(gistsUnstarMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsUnstarRequestCodecRegistry, GistsUnstarResponseDecoder, options)

  /**
   * Allows you to update a gist's description and to update, delete, or rename gist files. Files
   * from the previous version of the gist that aren't explicitly changed during an edit
   * are unchanged.
   *
   * At least one of `description` or `files` is required.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param request Request body sent to the operation.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsUpdateApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GistsUpdateError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsUpdate(
    request: InlineGistsPatchRequestJsonX8eb6f884?,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): GistSimple = executor.executeWithTypedErrors<InlineGistsPatchRequestJsonX8eb6f884?, GistsUpdateResponse, GistSimple>(
    request = SdkExecutionRequest(gistsUpdateMetadata, baseUri, request, listOf(GistsCodecs.GISTSUPDATE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsUpdateRequestCodecRegistry,
    responseDecoder = GistsUpdateResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsUpdateResponse.SuccessJson -> response.json
        is GistsUpdateResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsUpdateResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsUpdateResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsUpdateResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsUpdateResponse.Http404Json -> GistsUpdateApiException(response, statusCode, headers)
        is GistsUpdateResponse.Http422Json -> GistsUpdateApiException(response, statusCode, headers)
        is GistsUpdateResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Allows you to update a gist's description and to update, delete, or rename gist files. Files
   * from the previous version of the gist that aren't explicitly changed during an edit
   * are unchanged.
   *
   * At least one of `description` or `files` is required.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsUpdateWithResponse(
    request: InlineGistsPatchRequestJsonX8eb6f884?,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsUpdateResponse> = executor.executeWithResponse<InlineGistsPatchRequestJsonX8eb6f884?, GistsUpdateResponse>(SdkExecutionRequest(gistsUpdateMetadata, baseUri, request, listOf(GistsCodecs.GISTSUPDATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsUpdateRequestCodecRegistry, GistsUpdateResponseDecoder, options)

  /**
   * Updates a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GistsUpdateCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GistsUpdateCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gistsUpdateComment(
    request: InlineGistsCommentsPatchRequestJsonX6ff66047,
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): GistComment = executor.executeWithTypedErrors<InlineGistsCommentsPatchRequestJsonX6ff66047, GistsUpdateCommentResponse, GistComment>(
    request = SdkExecutionRequest(gistsUpdateCommentMetadata, baseUri, request, listOf(GistsCodecs.GISTSUPDATECOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
    }),
    requestCodecs = GistsCodecs.gistsUpdateCommentRequestCodecRegistry,
    responseDecoder = GistsUpdateCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GistsUpdateCommentResponse.SuccessJson -> response.json
        is GistsUpdateCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GistsUpdateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GistsUpdateCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GistsUpdateCommentResponse.Http404Json -> GistsUpdateCommentApiException(response, statusCode, headers)
        is GistsUpdateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a comment on a gist.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown. This is the default if you do not pass any
   * specific media type.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param gistId The unique identifier of the gist.
   * @param options Execution options.
   */
  public suspend fun gistsUpdateCommentWithResponse(
    request: InlineGistsCommentsPatchRequestJsonX6ff66047,
    commentId: Long,
    gistId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GistsUpdateCommentResponse> = executor.executeWithResponse<InlineGistsCommentsPatchRequestJsonX6ff66047, GistsUpdateCommentResponse>(SdkExecutionRequest(gistsUpdateCommentMetadata, baseUri, request, listOf(GistsCodecs.GISTSUPDATECOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gist_id", values = listOf(gistId.toString())))
  }), GistsCodecs.gistsUpdateCommentRequestCodecRegistry, GistsUpdateCommentResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `gists/check-is-starred` may expose through its typed API exception.
   */
  public sealed interface GistsCheckIsStarredError

  /**
   * Typed response alternatives for `gists/check-is-starred`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsCheckIsStarredResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCheckIsStarredResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCheckIsStarredResponse,
        GistsCheckIsStarredError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCheckIsStarredResponse,
        GistsCheckIsStarredError

    public class Http404Json(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCheckIsStarredResponse,
        GistsCheckIsStarredError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCheckIsStarredResponse
  }

  /**
   * Raised by `gists/check-is-starred` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsCheckIsStarredApiException(
    public val error: GistsCheckIsStarredError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/check-is-starred")

  private object GistsCheckIsStarredResponseDecoder : SdkResponseAlternativeDecoder<GistsCheckIsStarredResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsCheckIsStarredResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsCheckIsStarredResponse> = when {
      alternative.id == "gists/check-is-starred.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsCheckIsStarredResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/check-is-starred.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsCheckIsStarredResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/check-is-starred.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsCheckIsStarredResponse.Http403Json(
          json = GistsCodecs.gistsCheckIsStarredResponseCodecAlternative2Registry.select(listOf("gists/check-is-starred.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/check-is-starred.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsCheckIsStarredResponse.Http404Json(
          json = GistsCodecs.gistsCheckIsStarredResponseCodecAlternative3Registry.select(listOf("gists/check-is-starred.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsCheckIsStarredResponse = GistsCheckIsStarredResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/create` may expose through its typed API exception.
   */
  public sealed interface GistsCreateError

  /**
   * Typed response alternatives for `gists/create`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsCreateResponse {
    public class SuccessJson(
      public val json: GistSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse,
        GistsCreateError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse,
        GistsCreateError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse,
        GistsCreateError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse,
        GistsCreateError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateResponse
  }

  /**
   * Raised by `gists/create` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GistsCreateApiException(
    public val error: GistsCreateError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/create")

  private object GistsCreateResponseDecoder : SdkResponseAlternativeDecoder<GistsCreateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsCreateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsCreateResponse> = when {
      alternative.id == "gists/create.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsCreateResponse.SuccessJson(
          json = GistsCodecs.gistsCreateResponseCodecAlternative0Registry.select(listOf("gists/create.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsCreateResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsCreateResponse.Http403Json(
          json = GistsCodecs.gistsCreateResponseCodecAlternative2Registry.select(listOf("gists/create.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsCreateResponse.Http404Json(
          json = GistsCodecs.gistsCreateResponseCodecAlternative3Registry.select(listOf("gists/create.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create.response.alternative4" -> SdkResponseDecodeResult(
        value = GistsCreateResponse.Http422Json(
          json = GistsCodecs.gistsCreateResponseCodecAlternative4Registry.select(listOf("gists/create.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsCreateResponse = GistsCreateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/create-comment` may expose through its typed API exception.
   */
  public sealed interface GistsCreateCommentError

  /**
   * Typed response alternatives for `gists/create-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsCreateCommentResponse {
    public class SuccessJson(
      public val json: GistComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateCommentResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateCommentResponse,
        GistsCreateCommentError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateCommentResponse,
        GistsCreateCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateCommentResponse,
        GistsCreateCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsCreateCommentResponse
  }

  /**
   * Raised by `gists/create-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsCreateCommentApiException(
    public val error: GistsCreateCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/create-comment")

  private object GistsCreateCommentResponseDecoder : SdkResponseAlternativeDecoder<GistsCreateCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsCreateCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsCreateCommentResponse> = when {
      alternative.id == "gists/create-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsCreateCommentResponse.SuccessJson(
          json = GistsCodecs.gistsCreateCommentResponseCodecAlternative0Registry.select(listOf("gists/create-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsCreateCommentResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsCreateCommentResponse.Http403Json(
          json = GistsCodecs.gistsCreateCommentResponseCodecAlternative2Registry.select(listOf("gists/create-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/create-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsCreateCommentResponse.Http404Json(
          json = GistsCodecs.gistsCreateCommentResponseCodecAlternative3Registry.select(listOf("gists/create-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsCreateCommentResponse = GistsCreateCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/delete` may expose through its typed API exception.
   */
  public sealed interface GistsDeleteError

  /**
   * Typed response alternatives for `gists/delete`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsDeleteResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteResponse,
        GistsDeleteError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteResponse,
        GistsDeleteError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteResponse,
        GistsDeleteError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteResponse
  }

  /**
   * Raised by `gists/delete` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GistsDeleteApiException(
    public val error: GistsDeleteError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/delete")

  private object GistsDeleteResponseDecoder : SdkResponseAlternativeDecoder<GistsDeleteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsDeleteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsDeleteResponse> = when {
      alternative.id == "gists/delete.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsDeleteResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsDeleteResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsDeleteResponse.Http403Json(
          json = GistsCodecs.gistsDeleteResponseCodecAlternative2Registry.select(listOf("gists/delete.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsDeleteResponse.Http404Json(
          json = GistsCodecs.gistsDeleteResponseCodecAlternative3Registry.select(listOf("gists/delete.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsDeleteResponse = GistsDeleteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/delete-comment` may expose through its typed API exception.
   */
  public sealed interface GistsDeleteCommentError

  /**
   * Typed response alternatives for `gists/delete-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsDeleteCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteCommentResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteCommentResponse,
        GistsDeleteCommentError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteCommentResponse,
        GistsDeleteCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteCommentResponse,
        GistsDeleteCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsDeleteCommentResponse
  }

  /**
   * Raised by `gists/delete-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsDeleteCommentApiException(
    public val error: GistsDeleteCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/delete-comment")

  private object GistsDeleteCommentResponseDecoder : SdkResponseAlternativeDecoder<GistsDeleteCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsDeleteCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsDeleteCommentResponse> = when {
      alternative.id == "gists/delete-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsDeleteCommentResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsDeleteCommentResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsDeleteCommentResponse.Http403Json(
          json = GistsCodecs.gistsDeleteCommentResponseCodecAlternative2Registry.select(listOf("gists/delete-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/delete-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsDeleteCommentResponse.Http404Json(
          json = GistsCodecs.gistsDeleteCommentResponseCodecAlternative3Registry.select(listOf("gists/delete-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsDeleteCommentResponse = GistsDeleteCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/fork` may expose through its typed API exception.
   */
  public sealed interface GistsForkError

  /**
   * Typed response alternatives for `gists/fork`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsForkResponse {
    public class SuccessJson(
      public val json: BaseGist,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse,
        GistsForkError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse,
        GistsForkError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse,
        GistsForkError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse,
        GistsForkError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsForkResponse
  }

  /**
   * Raised by `gists/fork` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GistsForkApiException(
    public val error: GistsForkError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/fork")

  private object GistsForkResponseDecoder : SdkResponseAlternativeDecoder<GistsForkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsForkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsForkResponse> = when {
      alternative.id == "gists/fork.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsForkResponse.SuccessJson(
          json = GistsCodecs.gistsForkResponseCodecAlternative0Registry.select(listOf("gists/fork.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/fork.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsForkResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/fork.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsForkResponse.Http403Json(
          json = GistsCodecs.gistsForkResponseCodecAlternative2Registry.select(listOf("gists/fork.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/fork.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsForkResponse.Http404Json(
          json = GistsCodecs.gistsForkResponseCodecAlternative3Registry.select(listOf("gists/fork.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/fork.response.alternative4" -> SdkResponseDecodeResult(
        value = GistsForkResponse.Http422Json(
          json = GistsCodecs.gistsForkResponseCodecAlternative4Registry.select(listOf("gists/fork.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsForkResponse = GistsForkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/get` may expose through its typed API exception.
   */
  public sealed interface GistsGetError

  /**
   * Typed response alternatives for `gists/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsGetResponse {
    public class SuccessJson(
      public val json: GistSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetResponse,
        GistsGetError

    public class Http403Json(
      public val json: InlineForbiddenGistResponseJsonX346772b5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetResponse,
        GistsGetError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetResponse,
        GistsGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetResponse
  }

  /**
   * Raised by `gists/get` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GistsGetApiException(
    public val error: GistsGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/get")

  private object GistsGetResponseDecoder : SdkResponseAlternativeDecoder<GistsGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsGetResponse> = when {
      alternative.id == "gists/get.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsGetResponse.SuccessJson(
          json = GistsCodecs.gistsGetResponseCodecAlternative0Registry.select(listOf("gists/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsGetResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsGetResponse.Http403Json(
          json = GistsCodecs.gistsGetResponseCodecAlternative2Registry.select(listOf("gists/get.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsGetResponse.Http404Json(
          json = GistsCodecs.gistsGetResponseCodecAlternative3Registry.select(listOf("gists/get.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsGetResponse = GistsGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/get-comment` may expose through its typed API exception.
   */
  public sealed interface GistsGetCommentError

  /**
   * Typed response alternatives for `gists/get-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsGetCommentResponse {
    public class SuccessJson(
      public val json: GistComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetCommentResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetCommentResponse,
        GistsGetCommentError

    public class Http403Json(
      public val json: InlineForbiddenGistResponseJsonX346772b5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetCommentResponse,
        GistsGetCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetCommentResponse,
        GistsGetCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetCommentResponse
  }

  /**
   * Raised by `gists/get-comment` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsGetCommentApiException(
    public val error: GistsGetCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/get-comment")

  private object GistsGetCommentResponseDecoder : SdkResponseAlternativeDecoder<GistsGetCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsGetCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsGetCommentResponse> = when {
      alternative.id == "gists/get-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsGetCommentResponse.SuccessJson(
          json = GistsCodecs.gistsGetCommentResponseCodecAlternative0Registry.select(listOf("gists/get-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsGetCommentResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsGetCommentResponse.Http403Json(
          json = GistsCodecs.gistsGetCommentResponseCodecAlternative2Registry.select(listOf("gists/get-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsGetCommentResponse.Http404Json(
          json = GistsCodecs.gistsGetCommentResponseCodecAlternative3Registry.select(listOf("gists/get-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsGetCommentResponse = GistsGetCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/get-revision` may expose through its typed API exception.
   */
  public sealed interface GistsGetRevisionError

  /**
   * Typed response alternatives for `gists/get-revision`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsGetRevisionResponse {
    public class SuccessJson(
      public val json: GistSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetRevisionResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetRevisionResponse,
        GistsGetRevisionError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetRevisionResponse,
        GistsGetRevisionError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetRevisionResponse,
        GistsGetRevisionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsGetRevisionResponse
  }

  /**
   * Raised by `gists/get-revision` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsGetRevisionApiException(
    public val error: GistsGetRevisionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/get-revision")

  private object GistsGetRevisionResponseDecoder : SdkResponseAlternativeDecoder<GistsGetRevisionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsGetRevisionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsGetRevisionResponse> = when {
      alternative.id == "gists/get-revision.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsGetRevisionResponse.SuccessJson(
          json = GistsCodecs.gistsGetRevisionResponseCodecAlternative0Registry.select(listOf("gists/get-revision.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-revision.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsGetRevisionResponse.Http403Json(
          json = GistsCodecs.gistsGetRevisionResponseCodecAlternative1Registry.select(listOf("gists/get-revision.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-revision.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsGetRevisionResponse.Http404Json(
          json = GistsCodecs.gistsGetRevisionResponseCodecAlternative2Registry.select(listOf("gists/get-revision.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/get-revision.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsGetRevisionResponse.Http422Json(
          json = GistsCodecs.gistsGetRevisionResponseCodecAlternative3Registry.select(listOf("gists/get-revision.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsGetRevisionResponse = GistsGetRevisionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list` may expose through its typed API exception.
   */
  public sealed interface GistsListError

  /**
   * Typed response alternatives for `gists/list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsListResponse {
    public class SuccessJson(
      public val json: List<BaseGist>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListResponse,
        GistsListError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListResponse,
        GistsListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListResponse
  }

  /**
   * Raised by `gists/list` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GistsListApiException(
    public val error: GistsListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list")

  private object GistsListResponseDecoder : SdkResponseAlternativeDecoder<GistsListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListResponse> = when {
      alternative.id == "gists/list.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListResponse.SuccessJson(
          json = GistsCodecs.gistsListResponseCodecAlternative0Registry.select(listOf("gists/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListResponse.Http403Json(
          json = GistsCodecs.gistsListResponseCodecAlternative2Registry.select(listOf("gists/list.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListResponse = GistsListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-comments` may expose through its typed API exception.
   */
  public sealed interface GistsListCommentsError

  /**
   * Typed response alternatives for `gists/list-comments`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsListCommentsResponse {
    public class SuccessJson(
      public val json: List<GistComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommentsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommentsResponse,
        GistsListCommentsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommentsResponse,
        GistsListCommentsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommentsResponse,
        GistsListCommentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommentsResponse
  }

  /**
   * Raised by `gists/list-comments` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsListCommentsApiException(
    public val error: GistsListCommentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-comments")

  private object GistsListCommentsResponseDecoder : SdkResponseAlternativeDecoder<GistsListCommentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListCommentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListCommentsResponse> = when {
      alternative.id == "gists/list-comments.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListCommentsResponse.SuccessJson(
          json = GistsCodecs.gistsListCommentsResponseCodecAlternative0Registry.select(listOf("gists/list-comments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-comments.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListCommentsResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-comments.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListCommentsResponse.Http403Json(
          json = GistsCodecs.gistsListCommentsResponseCodecAlternative2Registry.select(listOf("gists/list-comments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-comments.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsListCommentsResponse.Http404Json(
          json = GistsCodecs.gistsListCommentsResponseCodecAlternative3Registry.select(listOf("gists/list-comments.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListCommentsResponse = GistsListCommentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-commits` may expose through its typed API exception.
   */
  public sealed interface GistsListCommitsError

  /**
   * Typed response alternatives for `gists/list-commits`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsListCommitsResponse {
    public class SuccessJson(
      public val json: List<GistCommit>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommitsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommitsResponse,
        GistsListCommitsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommitsResponse,
        GistsListCommitsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommitsResponse,
        GistsListCommitsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListCommitsResponse
  }

  /**
   * Raised by `gists/list-commits` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsListCommitsApiException(
    public val error: GistsListCommitsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-commits")

  private object GistsListCommitsResponseDecoder : SdkResponseAlternativeDecoder<GistsListCommitsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListCommitsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListCommitsResponse> = when {
      alternative.id == "gists/list-commits.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListCommitsResponse.SuccessJson(
          json = GistsCodecs.gistsListCommitsResponseCodecAlternative0Registry.select(listOf("gists/list-commits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-commits.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListCommitsResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-commits.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListCommitsResponse.Http403Json(
          json = GistsCodecs.gistsListCommitsResponseCodecAlternative2Registry.select(listOf("gists/list-commits.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-commits.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsListCommitsResponse.Http404Json(
          json = GistsCodecs.gistsListCommitsResponseCodecAlternative3Registry.select(listOf("gists/list-commits.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListCommitsResponse = GistsListCommitsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-for-user` may expose through its typed API exception.
   */
  public sealed interface GistsListForUserError

  /**
   * Typed response alternatives for `gists/list-for-user`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsListForUserResponse {
    public class SuccessJson(
      public val json: List<BaseGist>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForUserResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForUserResponse,
        GistsListForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForUserResponse
  }

  /**
   * Raised by `gists/list-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsListForUserApiException(
    public val error: GistsListForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-for-user")

  private object GistsListForUserResponseDecoder : SdkResponseAlternativeDecoder<GistsListForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListForUserResponse> = when {
      alternative.id == "gists/list-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListForUserResponse.SuccessJson(
          json = GistsCodecs.gistsListForUserResponseCodecAlternative0Registry.select(listOf("gists/list-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListForUserResponse.Http422Json(
          json = GistsCodecs.gistsListForUserResponseCodecAlternative1Registry.select(listOf("gists/list-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListForUserResponse = GistsListForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-forks` may expose through its typed API exception.
   */
  public sealed interface GistsListForksError

  /**
   * Typed response alternatives for `gists/list-forks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsListForksResponse {
    public class SuccessJson(
      public val json: List<GistSimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForksResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForksResponse,
        GistsListForksError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForksResponse,
        GistsListForksError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForksResponse,
        GistsListForksError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListForksResponse
  }

  /**
   * Raised by `gists/list-forks` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsListForksApiException(
    public val error: GistsListForksError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-forks")

  private object GistsListForksResponseDecoder : SdkResponseAlternativeDecoder<GistsListForksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListForksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListForksResponse> = when {
      alternative.id == "gists/list-forks.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListForksResponse.SuccessJson(
          json = GistsCodecs.gistsListForksResponseCodecAlternative0Registry.select(listOf("gists/list-forks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-forks.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListForksResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-forks.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListForksResponse.Http403Json(
          json = GistsCodecs.gistsListForksResponseCodecAlternative2Registry.select(listOf("gists/list-forks.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-forks.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsListForksResponse.Http404Json(
          json = GistsCodecs.gistsListForksResponseCodecAlternative3Registry.select(listOf("gists/list-forks.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListForksResponse = GistsListForksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-public` may expose through its typed API exception.
   */
  public sealed interface GistsListPublicError

  /**
   * Typed response alternatives for `gists/list-public`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsListPublicResponse {
    public class SuccessJson(
      public val json: List<BaseGist>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListPublicResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListPublicResponse,
        GistsListPublicError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListPublicResponse,
        GistsListPublicError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListPublicResponse,
        GistsListPublicError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListPublicResponse
  }

  /**
   * Raised by `gists/list-public` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsListPublicApiException(
    public val error: GistsListPublicError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-public")

  private object GistsListPublicResponseDecoder : SdkResponseAlternativeDecoder<GistsListPublicResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListPublicResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListPublicResponse> = when {
      alternative.id == "gists/list-public.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListPublicResponse.SuccessJson(
          json = GistsCodecs.gistsListPublicResponseCodecAlternative0Registry.select(listOf("gists/list-public.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-public.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListPublicResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-public.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListPublicResponse.Http403Json(
          json = GistsCodecs.gistsListPublicResponseCodecAlternative2Registry.select(listOf("gists/list-public.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-public.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsListPublicResponse.Http422Json(
          json = GistsCodecs.gistsListPublicResponseCodecAlternative3Registry.select(listOf("gists/list-public.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListPublicResponse = GistsListPublicResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/list-starred` may expose through its typed API exception.
   */
  public sealed interface GistsListStarredError

  /**
   * Typed response alternatives for `gists/list-starred`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsListStarredResponse {
    public class SuccessJson(
      public val json: List<BaseGist>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListStarredResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListStarredResponse,
        GistsListStarredError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListStarredResponse,
        GistsListStarredError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListStarredResponse,
        GistsListStarredError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsListStarredResponse
  }

  /**
   * Raised by `gists/list-starred` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GistsListStarredApiException(
    public val error: GistsListStarredError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/list-starred")

  private object GistsListStarredResponseDecoder : SdkResponseAlternativeDecoder<GistsListStarredResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsListStarredResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsListStarredResponse> = when {
      alternative.id == "gists/list-starred.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsListStarredResponse.SuccessJson(
          json = GistsCodecs.gistsListStarredResponseCodecAlternative0Registry.select(listOf("gists/list-starred.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-starred.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsListStarredResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-starred.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsListStarredResponse.Http401Json(
          json = GistsCodecs.gistsListStarredResponseCodecAlternative2Registry.select(listOf("gists/list-starred.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/list-starred.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsListStarredResponse.Http403Json(
          json = GistsCodecs.gistsListStarredResponseCodecAlternative3Registry.select(listOf("gists/list-starred.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsListStarredResponse = GistsListStarredResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/star` may expose through its typed API exception.
   */
  public sealed interface GistsStarError

  /**
   * Typed response alternatives for `gists/star`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsStarResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsStarResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsStarResponse,
        GistsStarError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsStarResponse,
        GistsStarError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsStarResponse,
        GistsStarError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsStarResponse
  }

  /**
   * Raised by `gists/star` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GistsStarApiException(
    public val error: GistsStarError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/star")

  private object GistsStarResponseDecoder : SdkResponseAlternativeDecoder<GistsStarResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsStarResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsStarResponse> = when {
      alternative.id == "gists/star.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsStarResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/star.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsStarResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/star.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsStarResponse.Http403Json(
          json = GistsCodecs.gistsStarResponseCodecAlternative2Registry.select(listOf("gists/star.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/star.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsStarResponse.Http404Json(
          json = GistsCodecs.gistsStarResponseCodecAlternative3Registry.select(listOf("gists/star.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsStarResponse = GistsStarResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/unstar` may expose through its typed API exception.
   */
  public sealed interface GistsUnstarError

  /**
   * Typed response alternatives for `gists/unstar`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsUnstarResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUnstarResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUnstarResponse,
        GistsUnstarError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUnstarResponse,
        GistsUnstarError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUnstarResponse,
        GistsUnstarError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUnstarResponse
  }

  /**
   * Raised by `gists/unstar` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GistsUnstarApiException(
    public val error: GistsUnstarError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/unstar")

  private object GistsUnstarResponseDecoder : SdkResponseAlternativeDecoder<GistsUnstarResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsUnstarResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsUnstarResponse> = when {
      alternative.id == "gists/unstar.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsUnstarResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/unstar.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsUnstarResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/unstar.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsUnstarResponse.Http403Json(
          json = GistsCodecs.gistsUnstarResponseCodecAlternative2Registry.select(listOf("gists/unstar.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/unstar.response.alternative3" -> SdkResponseDecodeResult(
        value = GistsUnstarResponse.Http404Json(
          json = GistsCodecs.gistsUnstarResponseCodecAlternative3Registry.select(listOf("gists/unstar.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsUnstarResponse = GistsUnstarResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/update` may expose through its typed API exception.
   */
  public sealed interface GistsUpdateError

  /**
   * Typed response alternatives for `gists/update`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GistsUpdateResponse {
    public class SuccessJson(
      public val json: GistSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateResponse,
        GistsUpdateError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateResponse,
        GistsUpdateError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateResponse
  }

  /**
   * Raised by `gists/update` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GistsUpdateApiException(
    public val error: GistsUpdateError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/update")

  private object GistsUpdateResponseDecoder : SdkResponseAlternativeDecoder<GistsUpdateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsUpdateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsUpdateResponse> = when {
      alternative.id == "gists/update.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsUpdateResponse.SuccessJson(
          json = GistsCodecs.gistsUpdateResponseCodecAlternative0Registry.select(listOf("gists/update.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/update.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsUpdateResponse.Http404Json(
          json = GistsCodecs.gistsUpdateResponseCodecAlternative1Registry.select(listOf("gists/update.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/update.response.alternative2" -> SdkResponseDecodeResult(
        value = GistsUpdateResponse.Http422Json(
          json = GistsCodecs.gistsUpdateResponseCodecAlternative2Registry.select(listOf("gists/update.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsUpdateResponse = GistsUpdateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gists/update-comment` may expose through its typed API exception.
   */
  public sealed interface GistsUpdateCommentError

  /**
   * Typed response alternatives for `gists/update-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GistsUpdateCommentResponse {
    public class SuccessJson(
      public val json: GistComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateCommentResponse,
        GistsUpdateCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GistsUpdateCommentResponse
  }

  /**
   * Raised by `gists/update-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GistsUpdateCommentApiException(
    public val error: GistsUpdateCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gists/update-comment")

  private object GistsUpdateCommentResponseDecoder : SdkResponseAlternativeDecoder<GistsUpdateCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GistsUpdateCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GistsUpdateCommentResponse> = when {
      alternative.id == "gists/update-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = GistsUpdateCommentResponse.SuccessJson(
          json = GistsCodecs.gistsUpdateCommentResponseCodecAlternative0Registry.select(listOf("gists/update-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gists/update-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = GistsUpdateCommentResponse.Http404Json(
          json = GistsCodecs.gistsUpdateCommentResponseCodecAlternative1Registry.select(listOf("gists/update-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GistsUpdateCommentResponse = GistsUpdateCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val gistsCheckIsStarredMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/check-is-starred",
          method = "GET",
          path = "/gists/{gist_id}/star",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/check-is-starred.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/check-is-starred.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/check-is-starred.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/check-is-starred.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsCreateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/create",
          method = "POST",
          path = "/gists",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GistSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsCreateCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/create-comment",
          method = "POST",
          path = "/gists/{gist_id}/comments",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GistComment",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/create-comment.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsDeleteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/delete",
          method = "DELETE",
          path = "/gists/{gist_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsDeleteCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/delete-comment",
          method = "DELETE",
          path = "/gists/{gist_id}/comments/{comment_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/delete-comment.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsForkMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/fork",
          method = "POST",
          path = "/gists/{gist_id}/forks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "BaseGist",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/fork.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/fork.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/fork.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/fork.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/fork.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/get",
          method = "GET",
          path = "/gists/{gist_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GistSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineForbiddenGistResponseJsonX346772b5",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsGetCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/get-comment",
          method = "GET",
          path = "/gists/{gist_id}/comments/{comment_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GistComment",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineForbiddenGistResponseJsonX346772b5",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-comment.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsGetRevisionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/get-revision",
          method = "GET",
          path = "/gists/{gist_id}/{sha}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GistSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-revision.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-revision.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-revision.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/get-revision.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list",
          method = "GET",
          path = "/gists",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list.response.alternative2",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListCommentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-comments",
          method = "GET",
          path = "/gists/{gist_id}/comments",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-comments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-comments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-comments.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-comments.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListCommitsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-commits",
          method = "GET",
          path = "/gists/{gist_id}/commits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-commits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-commits.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-commits.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-commits.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-for-user",
          method = "GET",
          path = "/users/{username}/gists",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-for-user.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListForksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-forks",
          method = "GET",
          path = "/gists/{gist_id}/forks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-forks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-forks.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-forks.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-forks.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListPublicMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-public",
          method = "GET",
          path = "/gists/public",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-public.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-public.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-public.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-public.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsListStarredMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/list-starred",
          method = "GET",
          path = "/gists/starred",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-starred.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-starred.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-starred.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/list-starred.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsStarMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/star",
          method = "PUT",
          path = "/gists/{gist_id}/star",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/star.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/star.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/star.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/star.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsUnstarMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/unstar",
          method = "DELETE",
          path = "/gists/{gist_id}/star",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/unstar.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/unstar.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/unstar.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/unstar.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsUpdateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/update",
          method = "PATCH",
          path = "/gists/{gist_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GistSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/update.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/update.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/update.response.alternative2",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val gistsUpdateCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gists/update-comment",
          method = "PATCH",
          path = "/gists/{gist_id}/comments/{comment_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GistComment",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/update-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "gists/update-comment.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
