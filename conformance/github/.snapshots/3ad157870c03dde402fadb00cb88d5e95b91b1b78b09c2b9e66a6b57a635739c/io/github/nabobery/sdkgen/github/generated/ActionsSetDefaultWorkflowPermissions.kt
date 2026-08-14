package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-set-default-workflow-permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-set-default-workflow-permissions
 */
@Serializable(with = ActionsSetDefaultWorkflowPermissions.Serializer::class)
public class ActionsSetDefaultWorkflowPermissions(
  public val canApprovePullRequestReviews: Boolean? = null,
  public val defaultWorkflowPermissions: ActionsDefaultWorkflowPermissions? = null,
) {
  public class Builder {
    public var canApprovePullRequestReviews: Boolean? = null

    public var defaultWorkflowPermissions: ActionsDefaultWorkflowPermissions? = null

    public fun build(): ActionsSetDefaultWorkflowPermissions = ActionsSetDefaultWorkflowPermissions(
      canApprovePullRequestReviews = canApprovePullRequestReviews,
      defaultWorkflowPermissions = defaultWorkflowPermissions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsSetDefaultWorkflowPermissions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsSetDefaultWorkflowPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsSetDefaultWorkflowPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsSetDefaultWorkflowPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsSetDefaultWorkflowPermissions must be a JSON object")
      return ActionsSetDefaultWorkflowPermissions(
        canApprovePullRequestReviews = rawObject["can_approve_pull_request_reviews"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        defaultWorkflowPermissions = rawObject["default_workflow_permissions"]?.let { json.decodeFromJsonElement<ActionsDefaultWorkflowPermissions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsSetDefaultWorkflowPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsSetDefaultWorkflowPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canApprovePullRequestReviews?.let { put("can_approve_pull_request_reviews", json.encodeToJsonElement(it)) }
        value.defaultWorkflowPermissions?.let { put("default_workflow_permissions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsSetDefaultWorkflowPermissions(block: ActionsSetDefaultWorkflowPermissions.Builder.() -> Unit): ActionsSetDefaultWorkflowPermissions = ActionsSetDefaultWorkflowPermissions.build(block)
