package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1permissions/put/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1permissions/put/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposActionsPermissionsPutRequestJsonXc7861234.Serializer::class)
public class InlineReposActionsPermissionsPutRequestJsonXc7861234(
  public val enabled: Boolean,
  public val allowedActions: AllowedActions? = null,
  public val shaPinningRequired: Boolean? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var allowedActions: AllowedActions? = null

    public var shaPinningRequired: Boolean? = null

    public fun build(): InlineReposActionsPermissionsPutRequestJsonXc7861234 {
      check(enabledValue != null) { "enabled is required" }
      return InlineReposActionsPermissionsPutRequestJsonXc7861234(
        enabled = enabled,
        allowedActions = allowedActions,
        shaPinningRequired = shaPinningRequired,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsPermissionsPutRequestJsonXc7861234 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsPermissionsPutRequestJsonXc7861234> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsPermissionsPutRequestJsonXc7861234 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsPermissionsPutRequestJsonXc7861234")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsPermissionsPutRequestJsonXc7861234 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineReposActionsPermissionsPutRequestJsonXc7861234(
        enabled = enabled,
        allowedActions = rawObject["allowed_actions"]?.let { json.decodeFromJsonElement<AllowedActions>(it) },
        shaPinningRequired = rawObject["sha_pinning_required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsPermissionsPutRequestJsonXc7861234) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsPermissionsPutRequestJsonXc7861234")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowedActions?.let { put("allowed_actions", json.encodeToJsonElement(it)) }
        value.shaPinningRequired?.let { put("sha_pinning_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsPermissionsPutRequestJsonXc7861234(block: InlineReposActionsPermissionsPutRequestJsonXc7861234.Builder.() -> Unit): InlineReposActionsPermissionsPutRequestJsonXc7861234 = InlineReposActionsPermissionsPutRequestJsonXc7861234.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsPermissionsPutRequestJsonXc7861234 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
