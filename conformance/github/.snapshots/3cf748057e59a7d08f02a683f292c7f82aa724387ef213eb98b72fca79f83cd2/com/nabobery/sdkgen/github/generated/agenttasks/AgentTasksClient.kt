package com.nabobery.sdkgen.github.generated.agenttasks

import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetParameterXdf8988b7
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetParameterXfe66e45b
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonX0674b184
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonX60a194d9
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse400JsonX63855404
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse400JsonX68a4c523
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse401JsonX899b2713
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse401JsonXaa4146e0
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse403JsonX04b2ba5e
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse403JsonX6a83598b
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse404JsonXf3807f6b
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse422JsonXebbaf9f5
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse422JsonXf9d150ed
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostRequestJsonX7c4d2325
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse201JsonX6230a80b
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse400JsonXb9821fa6
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse401JsonXd6c225c6
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse403JsonX676b3b50
import com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse422JsonXef21f4d3
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetParameterX23c864e0
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetParameterXb43b079d
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonX936b7689
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonXf398f1e0
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse400JsonX26899ec7
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse400JsonXfee757ae
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse401JsonX1d8b1c6d
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse401JsonX6a80ddd4
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse403JsonX66111592
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse403JsonXa2e3236c
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse404JsonXdd9058db
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse422JsonX75251d75
import com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse422JsonX7cde791f
import com.nabobery.sdkgen.github.generated.SdkJson
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object AgentTasksCodecs {
  public const val AGENTTASKSCREATETASKINREPO_REQUEST_CODEC_ID: String =
      "agent-tasks/create-task-in-repo.request"

  private val agentTasksCreateTaskInRepoRequestCodec:
      MediaTypeCodec<InlineAgentsReposTasksPostRequestJsonX7c4d2325> =
      KotlinxSerializationCodec(AGENTTASKSCREATETASKINREPO_REQUEST_CODEC_ID, InlineAgentsReposTasksPostRequestJsonX7c4d2325.Serializer, SdkJson)

  public const val AGENTTASKSCREATETASKINREPO_RESPONSE_CODEC_ID: String =
      "agent-tasks/create-task-in-repo.response"

  private val agentTasksCreateTaskInRepoResponseCodec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse201JsonX6230a80b> =
      KotlinxSerializationCodec(AGENTTASKSCREATETASKINREPO_RESPONSE_CODEC_ID, InlineAgentsReposTasksPostResponse201JsonX6230a80b.Serializer, SdkJson)

  private val agentTasksCreateTaskInRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse201JsonX6230a80b> =
      KotlinxSerializationCodec("agent-tasks/create-task-in-repo.response.alternative0", InlineAgentsReposTasksPostResponse201JsonX6230a80b.Serializer, SdkJson)

  public val agentTasksCreateTaskInRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse201JsonX6230a80b> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodecAlternative0Codec)

  private val agentTasksCreateTaskInRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse400JsonXb9821fa6> =
      KotlinxSerializationCodec("agent-tasks/create-task-in-repo.response.alternative1", InlineAgentsReposTasksPostResponse400JsonXb9821fa6.Serializer, SdkJson)

  public val agentTasksCreateTaskInRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse400JsonXb9821fa6> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodecAlternative1Codec)

  private val agentTasksCreateTaskInRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse401JsonXd6c225c6> =
      KotlinxSerializationCodec("agent-tasks/create-task-in-repo.response.alternative2", InlineAgentsReposTasksPostResponse401JsonXd6c225c6.Serializer, SdkJson)

  public val agentTasksCreateTaskInRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse401JsonXd6c225c6> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodecAlternative2Codec)

  private val agentTasksCreateTaskInRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse403JsonX676b3b50> =
      KotlinxSerializationCodec("agent-tasks/create-task-in-repo.response.alternative3", InlineAgentsReposTasksPostResponse403JsonX676b3b50.Serializer, SdkJson)

  public val agentTasksCreateTaskInRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse403JsonX676b3b50> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodecAlternative3Codec)

  private val agentTasksCreateTaskInRepoResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineAgentsReposTasksPostResponse422JsonXef21f4d3> =
      KotlinxSerializationCodec("agent-tasks/create-task-in-repo.response.alternative4", InlineAgentsReposTasksPostResponse422JsonXef21f4d3.Serializer, SdkJson)

  public val agentTasksCreateTaskInRepoResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse422JsonXef21f4d3> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodecAlternative4Codec)

  public val agentTasksCreateTaskInRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostRequestJsonX7c4d2325> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoRequestCodec)

  public val agentTasksCreateTaskInRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksPostResponse201JsonX6230a80b> =
      MediaTypeCodecRegistry.of(agentTasksCreateTaskInRepoResponseCodec)

  public const val AGENTTASKSGETTASKBYID_RESPONSE_CODEC_ID: String =
      "agent-tasks/get-task-by-id.response"

  private val agentTasksGetTaskByIdResponseCodec:
      MediaTypeCodec<InlineAgentsTasksGetResponse200JsonXf398f1e0> =
      KotlinxSerializationCodec(AGENTTASKSGETTASKBYID_RESPONSE_CODEC_ID, InlineAgentsTasksGetResponse200JsonXf398f1e0.Serializer, SdkJson)

  private val agentTasksGetTaskByIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse200JsonXf398f1e0> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative0", InlineAgentsTasksGetResponse200JsonXf398f1e0.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse200JsonXf398f1e0> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative0Codec)

  private val agentTasksGetTaskByIdResponseCodecAlternative1Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse400JsonXfee757ae> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative1", InlineAgentsTasksGetResponse400JsonXfee757ae.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse400JsonXfee757ae> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative1Codec)

  private val agentTasksGetTaskByIdResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse401JsonX1d8b1c6d> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative2", InlineAgentsTasksGetResponse401JsonX1d8b1c6d.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse401JsonX1d8b1c6d> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative2Codec)

  private val agentTasksGetTaskByIdResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse403JsonXa2e3236c> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative3", InlineAgentsTasksGetResponse403JsonXa2e3236c.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse403JsonXa2e3236c> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative3Codec)

  private val agentTasksGetTaskByIdResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse404JsonXdd9058db> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative4", InlineAgentsTasksGetResponse404JsonXdd9058db.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse404JsonXdd9058db> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative4Codec)

  private val agentTasksGetTaskByIdResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse422JsonX75251d75> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-id.response.alternative5", InlineAgentsTasksGetResponse422JsonX75251d75.Serializer, SdkJson)

  public val agentTasksGetTaskByIdResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse422JsonX75251d75> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodecAlternative5Codec)

  public val agentTasksGetTaskByIdRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentTasksGetTaskByIdResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse200JsonXf398f1e0> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByIdResponseCodec)

  public const val AGENTTASKSGETTASKBYREPOANDID_RESPONSE_CODEC_ID: String =
      "agent-tasks/get-task-by-repo-and-id.response"

  private val agentTasksGetTaskByRepoAndIdResponseCodec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse200JsonX0674b184> =
      KotlinxSerializationCodec(AGENTTASKSGETTASKBYREPOANDID_RESPONSE_CODEC_ID, InlineAgentsReposTasksGetResponse200JsonX0674b184.Serializer, SdkJson)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse200JsonX0674b184> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative0", InlineAgentsReposTasksGetResponse200JsonX0674b184.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse200JsonX0674b184> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative0Codec)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative1Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse400JsonX63855404> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative1", InlineAgentsReposTasksGetResponse400JsonX63855404.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse400JsonX63855404> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative1Codec)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse401JsonXaa4146e0> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative2", InlineAgentsReposTasksGetResponse401JsonXaa4146e0.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse401JsonXaa4146e0> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative2Codec)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse403JsonX6a83598b> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative3", InlineAgentsReposTasksGetResponse403JsonX6a83598b.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse403JsonX6a83598b> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative3Codec)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse404JsonXf3807f6b> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative4", InlineAgentsReposTasksGetResponse404JsonXf3807f6b.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse404JsonXf3807f6b> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative4Codec)

  private val agentTasksGetTaskByRepoAndIdResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse422JsonXf9d150ed> =
      KotlinxSerializationCodec("agent-tasks/get-task-by-repo-and-id.response.alternative5", InlineAgentsReposTasksGetResponse422JsonXf9d150ed.Serializer, SdkJson)

  public val agentTasksGetTaskByRepoAndIdResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse422JsonXf9d150ed> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodecAlternative5Codec)

  public val agentTasksGetTaskByRepoAndIdRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentTasksGetTaskByRepoAndIdResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse200JsonX0674b184> =
      MediaTypeCodecRegistry.of(agentTasksGetTaskByRepoAndIdResponseCodec)

  public const val AGENTTASKSLISTTASKS_RESPONSE_CODEC_ID: String = "agent-tasks/list-tasks.response"

  private val agentTasksListTasksResponseCodec:
      MediaTypeCodec<InlineAgentsTasksGetResponse200JsonX936b7689> =
      KotlinxSerializationCodec(AGENTTASKSLISTTASKS_RESPONSE_CODEC_ID, InlineAgentsTasksGetResponse200JsonX936b7689.Serializer, SdkJson)

  private val agentTasksListTasksResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse200JsonX936b7689> =
      KotlinxSerializationCodec("agent-tasks/list-tasks.response.alternative0", InlineAgentsTasksGetResponse200JsonX936b7689.Serializer, SdkJson)

  public val agentTasksListTasksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse200JsonX936b7689> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodecAlternative0Codec)

  private val agentTasksListTasksResponseCodecAlternative1Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse400JsonX26899ec7> =
      KotlinxSerializationCodec("agent-tasks/list-tasks.response.alternative1", InlineAgentsTasksGetResponse400JsonX26899ec7.Serializer, SdkJson)

  public val agentTasksListTasksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse400JsonX26899ec7> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodecAlternative1Codec)

  private val agentTasksListTasksResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse401JsonX6a80ddd4> =
      KotlinxSerializationCodec("agent-tasks/list-tasks.response.alternative2", InlineAgentsTasksGetResponse401JsonX6a80ddd4.Serializer, SdkJson)

  public val agentTasksListTasksResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse401JsonX6a80ddd4> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodecAlternative2Codec)

  private val agentTasksListTasksResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse403JsonX66111592> =
      KotlinxSerializationCodec("agent-tasks/list-tasks.response.alternative3", InlineAgentsTasksGetResponse403JsonX66111592.Serializer, SdkJson)

  public val agentTasksListTasksResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse403JsonX66111592> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodecAlternative3Codec)

  private val agentTasksListTasksResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineAgentsTasksGetResponse422JsonX7cde791f> =
      KotlinxSerializationCodec("agent-tasks/list-tasks.response.alternative4", InlineAgentsTasksGetResponse422JsonX7cde791f.Serializer, SdkJson)

  public val agentTasksListTasksResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse422JsonX7cde791f> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodecAlternative4Codec)

  public val agentTasksListTasksRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentTasksListTasksResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsTasksGetResponse200JsonX936b7689> =
      MediaTypeCodecRegistry.of(agentTasksListTasksResponseCodec)

  public const val AGENTTASKSLISTTASKSFORREPO_RESPONSE_CODEC_ID: String =
      "agent-tasks/list-tasks-for-repo.response"

  private val agentTasksListTasksForRepoResponseCodec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse200JsonX60a194d9> =
      KotlinxSerializationCodec(AGENTTASKSLISTTASKSFORREPO_RESPONSE_CODEC_ID, InlineAgentsReposTasksGetResponse200JsonX60a194d9.Serializer, SdkJson)

  private val agentTasksListTasksForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse200JsonX60a194d9> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative0", InlineAgentsReposTasksGetResponse200JsonX60a194d9.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse200JsonX60a194d9> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative0Codec)

  private val agentTasksListTasksForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse400JsonX68a4c523> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative1", InlineAgentsReposTasksGetResponse400JsonX68a4c523.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse400JsonX68a4c523> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative1Codec)

  private val agentTasksListTasksForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse401JsonX899b2713> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative2", InlineAgentsReposTasksGetResponse401JsonX899b2713.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse401JsonX899b2713> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative2Codec)

  private val agentTasksListTasksForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse403JsonX04b2ba5e> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative3", InlineAgentsReposTasksGetResponse403JsonX04b2ba5e.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse403JsonX04b2ba5e> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative3Codec)

  private val agentTasksListTasksForRepoResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative4", InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative4Codec)

  private val agentTasksListTasksForRepoResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineAgentsReposTasksGetResponse422JsonXebbaf9f5> =
      KotlinxSerializationCodec("agent-tasks/list-tasks-for-repo.response.alternative5", InlineAgentsReposTasksGetResponse422JsonXebbaf9f5.Serializer, SdkJson)

  public val agentTasksListTasksForRepoResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse422JsonXebbaf9f5> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodecAlternative5Codec)

  public val agentTasksListTasksForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentTasksListTasksForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAgentsReposTasksGetResponse200JsonX60a194d9> =
      MediaTypeCodecRegistry.of(agentTasksListTasksForRepoResponseCodec)
}

/**
 * Client for the 'agent-tasks' group of GitHub v3 REST API.
 */
public class AgentTasksClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@AgentTasksClient.authentication)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Starts a new Copilot cloud agent task for a repository.
   *
   * This endpoint is only available to users with a Copilot Business or Copilot Enterprise subscription.
   *
   * **Fine-grained access tokens for "Start a task"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read and write)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentTasksCreateTaskInRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AgentTasksCreateTaskInRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentTasksCreateTaskInRepo(
    request: InlineAgentsReposTasksPostRequestJsonX7c4d2325,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineAgentsReposTasksPostResponse201JsonX6230a80b = executor.executeWithTypedErrors<InlineAgentsReposTasksPostRequestJsonX7c4d2325, AgentTasksCreateTaskInRepoResponse, InlineAgentsReposTasksPostResponse201JsonX6230a80b>(
    request = SdkExecutionRequest(agentTasksCreateTaskInRepoMetadata, baseUri, request, listOf(AgentTasksCodecs.AGENTTASKSCREATETASKINREPO_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = AgentTasksCodecs.agentTasksCreateTaskInRepoRequestCodecRegistry,
    responseDecoder = AgentTasksCreateTaskInRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentTasksCreateTaskInRepoResponse.SuccessJson -> response.json
        is AgentTasksCreateTaskInRepoResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksCreateTaskInRepoResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksCreateTaskInRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksCreateTaskInRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksCreateTaskInRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentTasksCreateTaskInRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentTasksCreateTaskInRepoResponse.Http400Json -> AgentTasksCreateTaskInRepoApiException(response, statusCode, headers)
        is AgentTasksCreateTaskInRepoResponse.Http401Json -> AgentTasksCreateTaskInRepoApiException(response, statusCode, headers)
        is AgentTasksCreateTaskInRepoResponse.Http403Json -> AgentTasksCreateTaskInRepoApiException(response, statusCode, headers)
        is AgentTasksCreateTaskInRepoResponse.Http422Json -> AgentTasksCreateTaskInRepoApiException(response, statusCode, headers)
        is AgentTasksCreateTaskInRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Starts a new Copilot cloud agent task for a repository.
   *
   * This endpoint is only available to users with a Copilot Business or Copilot Enterprise subscription.
   *
   * **Fine-grained access tokens for "Start a task"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read and write)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun agentTasksCreateTaskInRepoWithResponse(
    request: InlineAgentsReposTasksPostRequestJsonX7c4d2325,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentTasksCreateTaskInRepoResponse> = executor.executeWithResponse<InlineAgentsReposTasksPostRequestJsonX7c4d2325, AgentTasksCreateTaskInRepoResponse>(SdkExecutionRequest(agentTasksCreateTaskInRepoMetadata, baseUri, request, listOf(AgentTasksCodecs.AGENTTASKSCREATETASKINREPO_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentTasksCodecs.agentTasksCreateTaskInRepoRequestCodecRegistry, AgentTasksCreateTaskInRepoResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a task by ID with its associated sessions
   *
   * **Fine-grained access tokens for "Get a task by ID"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentTasksGetTaskByIdApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AgentTasksGetTaskByIdError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentTasksGetTaskById(taskId: String, options: CallOptions = CallOptions()): InlineAgentsTasksGetResponse200JsonXf398f1e0 = executor.executeWithTypedErrors<Unit, AgentTasksGetTaskByIdResponse, InlineAgentsTasksGetResponse200JsonXf398f1e0>(
    request = SdkExecutionRequest(agentTasksGetTaskByIdMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "task_id", values = listOf(taskId.toString())))
    }),
    requestCodecs = AgentTasksCodecs.agentTasksGetTaskByIdRequestCodecRegistry,
    responseDecoder = AgentTasksGetTaskByIdResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentTasksGetTaskByIdResponse.SuccessJson -> response.json
        is AgentTasksGetTaskByIdResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByIdResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByIdResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByIdResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByIdResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentTasksGetTaskByIdResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentTasksGetTaskByIdResponse.Http400Json -> AgentTasksGetTaskByIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByIdResponse.Http401Json -> AgentTasksGetTaskByIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByIdResponse.Http403Json -> AgentTasksGetTaskByIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByIdResponse.Http404Json -> AgentTasksGetTaskByIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByIdResponse.Http422Json -> AgentTasksGetTaskByIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a task by ID with its associated sessions
   *
   * **Fine-grained access tokens for "Get a task by ID"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun agentTasksGetTaskByIdWithResponse(taskId: String, options: CallOptions = CallOptions()): SdkResponseResult<AgentTasksGetTaskByIdResponse> = executor.executeWithResponse<Unit, AgentTasksGetTaskByIdResponse>(SdkExecutionRequest(agentTasksGetTaskByIdMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "task_id", values = listOf(taskId.toString())))
  }), AgentTasksCodecs.agentTasksGetTaskByIdRequestCodecRegistry, AgentTasksGetTaskByIdResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a task by ID scoped to an owner/repo path
   *
   * **Fine-grained access tokens for "Get a task by repo"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentTasksGetTaskByRepoAndIdApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AgentTasksGetTaskByRepoAndIdError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentTasksGetTaskByRepoAndId(
    owner: String,
    repo: String,
    taskId: String,
    options: CallOptions = CallOptions(),
  ): InlineAgentsReposTasksGetResponse200JsonX0674b184 = executor.executeWithTypedErrors<Unit, AgentTasksGetTaskByRepoAndIdResponse, InlineAgentsReposTasksGetResponse200JsonX0674b184>(
    request = SdkExecutionRequest(agentTasksGetTaskByRepoAndIdMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "task_id", values = listOf(taskId.toString())))
    }),
    requestCodecs = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdRequestCodecRegistry,
    responseDecoder = AgentTasksGetTaskByRepoAndIdResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentTasksGetTaskByRepoAndIdResponse.SuccessJson -> response.json
        is AgentTasksGetTaskByRepoAndIdResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentTasksGetTaskByRepoAndIdResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentTasksGetTaskByRepoAndIdResponse.Http400Json -> AgentTasksGetTaskByRepoAndIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByRepoAndIdResponse.Http401Json -> AgentTasksGetTaskByRepoAndIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByRepoAndIdResponse.Http403Json -> AgentTasksGetTaskByRepoAndIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByRepoAndIdResponse.Http404Json -> AgentTasksGetTaskByRepoAndIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByRepoAndIdResponse.Http422Json -> AgentTasksGetTaskByRepoAndIdApiException(response, statusCode, headers)
        is AgentTasksGetTaskByRepoAndIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a task by ID scoped to an owner/repo path
   *
   * **Fine-grained access tokens for "Get a task by repo"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun agentTasksGetTaskByRepoAndIdWithResponse(
    owner: String,
    repo: String,
    taskId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentTasksGetTaskByRepoAndIdResponse> = executor.executeWithResponse<Unit, AgentTasksGetTaskByRepoAndIdResponse>(SdkExecutionRequest(agentTasksGetTaskByRepoAndIdMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "task_id", values = listOf(taskId.toString())))
  }), AgentTasksCodecs.agentTasksGetTaskByRepoAndIdRequestCodecRegistry, AgentTasksGetTaskByRepoAndIdResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a list of tasks for the authenticated user
   *
   * **Fine-grained access tokens for "List tasks"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentTasksListTasksApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AgentTasksListTasksError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentTasksListTasks(
    direction: InlineAgentsTasksGetParameterXb43b079d? = null,
    isArchived: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineAgentsTasksGetParameterX23c864e0? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAgentsTasksGetResponse200JsonX936b7689 = executor.executeWithTypedErrors<Unit, AgentTasksListTasksResponse, InlineAgentsTasksGetResponse200JsonX936b7689>(
    request = SdkExecutionRequest(agentTasksListTasksMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_archived", values = isArchived?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AgentTasksCodecs.agentTasksListTasksRequestCodecRegistry,
    responseDecoder = AgentTasksListTasksResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentTasksListTasksResponse.SuccessJson -> response.json
        is AgentTasksListTasksResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentTasksListTasksResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentTasksListTasksResponse.Http400Json -> AgentTasksListTasksApiException(response, statusCode, headers)
        is AgentTasksListTasksResponse.Http401Json -> AgentTasksListTasksApiException(response, statusCode, headers)
        is AgentTasksListTasksResponse.Http403Json -> AgentTasksListTasksApiException(response, statusCode, headers)
        is AgentTasksListTasksResponse.Http422Json -> AgentTasksListTasksApiException(response, statusCode, headers)
        is AgentTasksListTasksResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a list of tasks for the authenticated user
   *
   * **Fine-grained access tokens for "List tasks"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun agentTasksListTasksWithResponse(
    direction: InlineAgentsTasksGetParameterXb43b079d? = null,
    isArchived: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineAgentsTasksGetParameterX23c864e0? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentTasksListTasksResponse> = executor.executeWithResponse<Unit, AgentTasksListTasksResponse>(SdkExecutionRequest(agentTasksListTasksMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_archived", values = isArchived?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentTasksCodecs.agentTasksListTasksRequestCodecRegistry, AgentTasksListTasksResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a list of tasks for a specific repository
   *
   * **Fine-grained access tokens for "List tasks for repository"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentTasksListTasksForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AgentTasksListTasksForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentTasksListTasksForRepo(
    owner: String,
    repo: String,
    creatorId: List<Int>? = null,
    direction: InlineAgentsReposTasksGetParameterXdf8988b7? = null,
    isArchived: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineAgentsReposTasksGetParameterXfe66e45b? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAgentsReposTasksGetResponse200JsonX60a194d9 = executor.executeWithTypedErrors<Unit, AgentTasksListTasksForRepoResponse, InlineAgentsReposTasksGetResponse200JsonX60a194d9>(
    request = SdkExecutionRequest(agentTasksListTasksForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "creator_id", values = creatorId?.map { it.toString() }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_archived", values = isArchived?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AgentTasksCodecs.agentTasksListTasksForRepoRequestCodecRegistry,
    responseDecoder = AgentTasksListTasksForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentTasksListTasksForRepoResponse.SuccessJson -> response.json
        is AgentTasksListTasksForRepoResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksForRepoResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AgentTasksListTasksForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentTasksListTasksForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentTasksListTasksForRepoResponse.Http400Json -> AgentTasksListTasksForRepoApiException(response, statusCode, headers)
        is AgentTasksListTasksForRepoResponse.Http401Json -> AgentTasksListTasksForRepoApiException(response, statusCode, headers)
        is AgentTasksListTasksForRepoResponse.Http403Json -> AgentTasksListTasksForRepoApiException(response, statusCode, headers)
        is AgentTasksListTasksForRepoResponse.Http404Json -> AgentTasksListTasksForRepoApiException(response, statusCode, headers)
        is AgentTasksListTasksForRepoResponse.Http422Json -> AgentTasksListTasksForRepoApiException(response, statusCode, headers)
        is AgentTasksListTasksForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Returns a list of tasks for a specific repository
   *
   * **Fine-grained access tokens for "List tasks for repository"**
   *
   * This endpoint works with the following fine-grained token types:
   *
   * * [GitHub App user access
   * tokens](https://docs.github.com/en/apps/creating-github-apps/authenticating-with-a-github-app/generating-a-user-acc
   * ess-token-for-a-github-app)
   * * [Fine-grained personal access
   * tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-acces
   * s-tokens#creating-a-fine-grained-personal-access-token)
   *
   * The fine-grained token must have the following permission set:
   *
   * * "Agent tasks" repository permissions (read)
   *
   * GitHub App installation access tokens are not supported for this endpoint.
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun agentTasksListTasksForRepoWithResponse(
    owner: String,
    repo: String,
    creatorId: List<Int>? = null,
    direction: InlineAgentsReposTasksGetParameterXdf8988b7? = null,
    isArchived: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineAgentsReposTasksGetParameterXfe66e45b? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentTasksListTasksForRepoResponse> = executor.executeWithResponse<Unit, AgentTasksListTasksForRepoResponse>(SdkExecutionRequest(agentTasksListTasksForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "creator_id", values = creatorId?.map { it.toString() }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_archived", values = isArchived?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentTasksCodecs.agentTasksListTasksForRepoRequestCodecRegistry, AgentTasksListTasksForRepoResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `agent-tasks/create-task-in-repo` may expose through its typed API
   * exception.
   */
  public sealed interface AgentTasksCreateTaskInRepoError

  /**
   * Typed response alternatives for `agent-tasks/create-task-in-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentTasksCreateTaskInRepoResponse {
    public class SuccessJson(
      public val json: InlineAgentsReposTasksPostResponse201JsonX6230a80b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse

    public class Http400Json(
      public val json: InlineAgentsReposTasksPostResponse400JsonXb9821fa6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse,
        AgentTasksCreateTaskInRepoError

    public class Http401Json(
      public val json: InlineAgentsReposTasksPostResponse401JsonXd6c225c6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse,
        AgentTasksCreateTaskInRepoError

    public class Http403Json(
      public val json: InlineAgentsReposTasksPostResponse403JsonX676b3b50,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse,
        AgentTasksCreateTaskInRepoError

    public class Http422Json(
      public val json: InlineAgentsReposTasksPostResponse422JsonXef21f4d3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse,
        AgentTasksCreateTaskInRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksCreateTaskInRepoResponse
  }

  /**
   * Raised by `agent-tasks/create-task-in-repo` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class AgentTasksCreateTaskInRepoApiException(
    public val error: AgentTasksCreateTaskInRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agent-tasks/create-task-in-repo")

  private object AgentTasksCreateTaskInRepoResponseDecoder : SdkResponseAlternativeDecoder<AgentTasksCreateTaskInRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentTasksCreateTaskInRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentTasksCreateTaskInRepoResponse> = when {
      alternative.id == "agent-tasks/create-task-in-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentTasksCreateTaskInRepoResponse.SuccessJson(
          json = AgentTasksCodecs.agentTasksCreateTaskInRepoResponseCodecAlternative0Registry.select(listOf("agent-tasks/create-task-in-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/create-task-in-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentTasksCreateTaskInRepoResponse.Http400Json(
          json = AgentTasksCodecs.agentTasksCreateTaskInRepoResponseCodecAlternative1Registry.select(listOf("agent-tasks/create-task-in-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/create-task-in-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = AgentTasksCreateTaskInRepoResponse.Http401Json(
          json = AgentTasksCodecs.agentTasksCreateTaskInRepoResponseCodecAlternative2Registry.select(listOf("agent-tasks/create-task-in-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/create-task-in-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = AgentTasksCreateTaskInRepoResponse.Http403Json(
          json = AgentTasksCodecs.agentTasksCreateTaskInRepoResponseCodecAlternative3Registry.select(listOf("agent-tasks/create-task-in-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/create-task-in-repo.response.alternative4" -> SdkResponseDecodeResult(
        value = AgentTasksCreateTaskInRepoResponse.Http422Json(
          json = AgentTasksCodecs.agentTasksCreateTaskInRepoResponseCodecAlternative4Registry.select(listOf("agent-tasks/create-task-in-repo.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentTasksCreateTaskInRepoResponse = AgentTasksCreateTaskInRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agent-tasks/get-task-by-id` may expose through its typed API
   * exception.
   */
  public sealed interface AgentTasksGetTaskByIdError

  /**
   * Typed response alternatives for `agent-tasks/get-task-by-id`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentTasksGetTaskByIdResponse {
    public class SuccessJson(
      public val json: InlineAgentsTasksGetResponse200JsonXf398f1e0,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse

    public class Http400Json(
      public val json: InlineAgentsTasksGetResponse400JsonXfee757ae,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse,
        AgentTasksGetTaskByIdError

    public class Http401Json(
      public val json: InlineAgentsTasksGetResponse401JsonX1d8b1c6d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse,
        AgentTasksGetTaskByIdError

    public class Http403Json(
      public val json: InlineAgentsTasksGetResponse403JsonXa2e3236c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse,
        AgentTasksGetTaskByIdError

    public class Http404Json(
      public val json: InlineAgentsTasksGetResponse404JsonXdd9058db,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse,
        AgentTasksGetTaskByIdError

    public class Http422Json(
      public val json: InlineAgentsTasksGetResponse422JsonX75251d75,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse,
        AgentTasksGetTaskByIdError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByIdResponse
  }

  /**
   * Raised by `agent-tasks/get-task-by-id` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AgentTasksGetTaskByIdApiException(
    public val error: AgentTasksGetTaskByIdError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agent-tasks/get-task-by-id")

  private object AgentTasksGetTaskByIdResponseDecoder : SdkResponseAlternativeDecoder<AgentTasksGetTaskByIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentTasksGetTaskByIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentTasksGetTaskByIdResponse> = when {
      alternative.id == "agent-tasks/get-task-by-id.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.SuccessJson(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative0Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-id.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.Http400Json(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative1Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-id.response.alternative2" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.Http401Json(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative2Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-id.response.alternative3" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.Http403Json(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative3Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-id.response.alternative4" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.Http404Json(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative4Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-id.response.alternative5" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByIdResponse.Http422Json(
          json = AgentTasksCodecs.agentTasksGetTaskByIdResponseCodecAlternative5Registry.select(listOf("agent-tasks/get-task-by-id.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentTasksGetTaskByIdResponse = AgentTasksGetTaskByIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agent-tasks/get-task-by-repo-and-id` may expose through its typed
   * API exception.
   */
  public sealed interface AgentTasksGetTaskByRepoAndIdError

  /**
   * Typed response alternatives for `agent-tasks/get-task-by-repo-and-id`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AgentTasksGetTaskByRepoAndIdResponse {
    public class SuccessJson(
      public val json: InlineAgentsReposTasksGetResponse200JsonX0674b184,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse

    public class Http400Json(
      public val json: InlineAgentsReposTasksGetResponse400JsonX63855404,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse,
        AgentTasksGetTaskByRepoAndIdError

    public class Http401Json(
      public val json: InlineAgentsReposTasksGetResponse401JsonXaa4146e0,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse,
        AgentTasksGetTaskByRepoAndIdError

    public class Http403Json(
      public val json: InlineAgentsReposTasksGetResponse403JsonX6a83598b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse,
        AgentTasksGetTaskByRepoAndIdError

    public class Http404Json(
      public val json: InlineAgentsReposTasksGetResponse404JsonXf3807f6b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse,
        AgentTasksGetTaskByRepoAndIdError

    public class Http422Json(
      public val json: InlineAgentsReposTasksGetResponse422JsonXf9d150ed,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse,
        AgentTasksGetTaskByRepoAndIdError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksGetTaskByRepoAndIdResponse
  }

  /**
   * Raised by `agent-tasks/get-task-by-repo-and-id` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class AgentTasksGetTaskByRepoAndIdApiException(
    public val error: AgentTasksGetTaskByRepoAndIdError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agent-tasks/get-task-by-repo-and-id")

  private object AgentTasksGetTaskByRepoAndIdResponseDecoder : SdkResponseAlternativeDecoder<AgentTasksGetTaskByRepoAndIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentTasksGetTaskByRepoAndIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentTasksGetTaskByRepoAndIdResponse> = when {
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.SuccessJson(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative0Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.Http400Json(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative1Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative2" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.Http401Json(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative2Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative3" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.Http403Json(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative3Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative4" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.Http404Json(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative4Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/get-task-by-repo-and-id.response.alternative5" -> SdkResponseDecodeResult(
        value = AgentTasksGetTaskByRepoAndIdResponse.Http422Json(
          json = AgentTasksCodecs.agentTasksGetTaskByRepoAndIdResponseCodecAlternative5Registry.select(listOf("agent-tasks/get-task-by-repo-and-id.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentTasksGetTaskByRepoAndIdResponse = AgentTasksGetTaskByRepoAndIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agent-tasks/list-tasks` may expose through its typed API exception.
   */
  public sealed interface AgentTasksListTasksError

  /**
   * Typed response alternatives for `agent-tasks/list-tasks`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentTasksListTasksResponse {
    public class SuccessJson(
      public val json: InlineAgentsTasksGetResponse200JsonX936b7689,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse

    public class Http400Json(
      public val json: InlineAgentsTasksGetResponse400JsonX26899ec7,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse,
        AgentTasksListTasksError

    public class Http401Json(
      public val json: InlineAgentsTasksGetResponse401JsonX6a80ddd4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse,
        AgentTasksListTasksError

    public class Http403Json(
      public val json: InlineAgentsTasksGetResponse403JsonX66111592,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse,
        AgentTasksListTasksError

    public class Http422Json(
      public val json: InlineAgentsTasksGetResponse422JsonX7cde791f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse,
        AgentTasksListTasksError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksResponse
  }

  /**
   * Raised by `agent-tasks/list-tasks` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AgentTasksListTasksApiException(
    public val error: AgentTasksListTasksError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agent-tasks/list-tasks")

  private object AgentTasksListTasksResponseDecoder : SdkResponseAlternativeDecoder<AgentTasksListTasksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentTasksListTasksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentTasksListTasksResponse> = when {
      alternative.id == "agent-tasks/list-tasks.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksResponse.SuccessJson(
          json = AgentTasksCodecs.agentTasksListTasksResponseCodecAlternative0Registry.select(listOf("agent-tasks/list-tasks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksResponse.Http400Json(
          json = AgentTasksCodecs.agentTasksListTasksResponseCodecAlternative1Registry.select(listOf("agent-tasks/list-tasks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks.response.alternative2" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksResponse.Http401Json(
          json = AgentTasksCodecs.agentTasksListTasksResponseCodecAlternative2Registry.select(listOf("agent-tasks/list-tasks.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks.response.alternative3" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksResponse.Http403Json(
          json = AgentTasksCodecs.agentTasksListTasksResponseCodecAlternative3Registry.select(listOf("agent-tasks/list-tasks.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks.response.alternative4" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksResponse.Http422Json(
          json = AgentTasksCodecs.agentTasksListTasksResponseCodecAlternative4Registry.select(listOf("agent-tasks/list-tasks.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentTasksListTasksResponse = AgentTasksListTasksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agent-tasks/list-tasks-for-repo` may expose through its typed API
   * exception.
   */
  public sealed interface AgentTasksListTasksForRepoError

  /**
   * Typed response alternatives for `agent-tasks/list-tasks-for-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentTasksListTasksForRepoResponse {
    public class SuccessJson(
      public val json: InlineAgentsReposTasksGetResponse200JsonX60a194d9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse

    public class Http400Json(
      public val json: InlineAgentsReposTasksGetResponse400JsonX68a4c523,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse,
        AgentTasksListTasksForRepoError

    public class Http401Json(
      public val json: InlineAgentsReposTasksGetResponse401JsonX899b2713,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse,
        AgentTasksListTasksForRepoError

    public class Http403Json(
      public val json: InlineAgentsReposTasksGetResponse403JsonX04b2ba5e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse,
        AgentTasksListTasksForRepoError

    public class Http404Json(
      public val json: InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse,
        AgentTasksListTasksForRepoError

    public class Http422Json(
      public val json: InlineAgentsReposTasksGetResponse422JsonXebbaf9f5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse,
        AgentTasksListTasksForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentTasksListTasksForRepoResponse
  }

  /**
   * Raised by `agent-tasks/list-tasks-for-repo` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class AgentTasksListTasksForRepoApiException(
    public val error: AgentTasksListTasksForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agent-tasks/list-tasks-for-repo")

  private object AgentTasksListTasksForRepoResponseDecoder : SdkResponseAlternativeDecoder<AgentTasksListTasksForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentTasksListTasksForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentTasksListTasksForRepoResponse> = when {
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.SuccessJson(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative0Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.Http400Json(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative1Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.Http401Json(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative2Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.Http403Json(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative3Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative4" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.Http404Json(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative4Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agent-tasks/list-tasks-for-repo.response.alternative5" -> SdkResponseDecodeResult(
        value = AgentTasksListTasksForRepoResponse.Http422Json(
          json = AgentTasksCodecs.agentTasksListTasksForRepoResponseCodecAlternative5Registry.select(listOf("agent-tasks/list-tasks-for-repo.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentTasksListTasksForRepoResponse = AgentTasksListTasksForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val agentTasksCreateTaskInRepoMetadata: OperationMetadata = OperationMetadata(
          operationId = "agent-tasks/create-task-in-repo",
          method = "POST",
          path = "/agents/repos/{owner}/{repo}/tasks",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksPostResponse201JsonX6230a80b",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/create-task-in-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksPostResponse400JsonXb9821fa6",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/create-task-in-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksPostResponse401JsonXd6c225c6",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/create-task-in-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksPostResponse403JsonX676b3b50",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/create-task-in-repo.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksPostResponse422JsonXef21f4d3",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/create-task-in-repo.response.alternative4",
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
        )

    public val agentTasksGetTaskByIdMetadata: OperationMetadata = OperationMetadata(
          operationId = "agent-tasks/get-task-by-id",
          method = "GET",
          path = "/agents/tasks/{task_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse200JsonXf398f1e0",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse400JsonXfee757ae",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse401JsonX1d8b1c6d",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse403JsonXa2e3236c",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse404JsonXdd9058db",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse422JsonX75251d75",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-id.response.alternative5",
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
        )

    public val agentTasksGetTaskByRepoAndIdMetadata: OperationMetadata = OperationMetadata(
          operationId = "agent-tasks/get-task-by-repo-and-id",
          method = "GET",
          path = "/agents/repos/{owner}/{repo}/tasks/{task_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse200JsonX0674b184",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse400JsonX63855404",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse401JsonXaa4146e0",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse403JsonX6a83598b",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse404JsonXf3807f6b",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse422JsonXf9d150ed",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/get-task-by-repo-and-id.response.alternative5",
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
        )

    public val agentTasksListTasksMetadata: OperationMetadata = OperationMetadata(
          operationId = "agent-tasks/list-tasks",
          method = "GET",
          path = "/agents/tasks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse200JsonX936b7689",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse400JsonX26899ec7",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse401JsonX6a80ddd4",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse403JsonX66111592",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsTasksGetResponse422JsonX7cde791f",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks.response.alternative4",
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
        )

    public val agentTasksListTasksForRepoMetadata: OperationMetadata = OperationMetadata(
          operationId = "agent-tasks/list-tasks-for-repo",
          method = "GET",
          path = "/agents/repos/{owner}/{repo}/tasks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse200JsonX60a194d9",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse400JsonX68a4c523",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse401JsonX899b2713",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse403JsonX04b2ba5e",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse404JsonXb6bc6cb6",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAgentsReposTasksGetResponse422JsonXebbaf9f5",
              mode = SdkResponseMode.BUFFERED,
              id = "agent-tasks/list-tasks-for-repo.response.alternative5",
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
        )
  }
}
