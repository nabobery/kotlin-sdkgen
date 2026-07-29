package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-get-default-workflow-permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-get-default-workflow-permissions
 */
@Serializable(with = ActionsGetDefaultWorkflowPermissions.Serializer::class)
public class ActionsGetDefaultWorkflowPermissions(
  public val canApprovePullRequestReviews: Boolean,
  public val defaultWorkflowPermissions: ActionsDefaultWorkflowPermissions,
) {
  public class Builder {
    private var canApprovePullRequestReviewsValue: Boolean? = null

    public var canApprovePullRequestReviews: Boolean
      get() = requireNotNull(canApprovePullRequestReviewsValue) { "canApprovePullRequestReviews is required" }
      set(`value`) {
        canApprovePullRequestReviewsValue = value
      }

    private var defaultWorkflowPermissionsValue: ActionsDefaultWorkflowPermissions? = null

    public var defaultWorkflowPermissions: ActionsDefaultWorkflowPermissions
      get() = requireNotNull(defaultWorkflowPermissionsValue) { "defaultWorkflowPermissions is required" }
      set(`value`) {
        defaultWorkflowPermissionsValue = value
      }

    public fun build(): ActionsGetDefaultWorkflowPermissions {
      check(canApprovePullRequestReviewsValue != null) { "canApprovePullRequestReviews is required" }
      check(defaultWorkflowPermissionsValue != null) { "defaultWorkflowPermissions is required" }
      return ActionsGetDefaultWorkflowPermissions(
        canApprovePullRequestReviews = canApprovePullRequestReviews,
        defaultWorkflowPermissions = defaultWorkflowPermissions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsGetDefaultWorkflowPermissions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsGetDefaultWorkflowPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsGetDefaultWorkflowPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsGetDefaultWorkflowPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsGetDefaultWorkflowPermissions must be a JSON object")
      val canApprovePullRequestReviews = json.decodeRequired<Boolean>(rawObject, "can_approve_pull_request_reviews")
      val defaultWorkflowPermissions = json.decodeRequired<ActionsDefaultWorkflowPermissions>(rawObject, "default_workflow_permissions")
      return ActionsGetDefaultWorkflowPermissions(
        canApprovePullRequestReviews = canApprovePullRequestReviews,
        defaultWorkflowPermissions = defaultWorkflowPermissions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsGetDefaultWorkflowPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsGetDefaultWorkflowPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("can_approve_pull_request_reviews", json.encodeToJsonElement(value.canApprovePullRequestReviews))
        put("default_workflow_permissions", json.encodeToJsonElement(value.defaultWorkflowPermissions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsGetDefaultWorkflowPermissions(block: ActionsGetDefaultWorkflowPermissions.Builder.() -> Unit): ActionsGetDefaultWorkflowPermissions = ActionsGetDefaultWorkflowPermissions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsGetDefaultWorkflowPermissions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
