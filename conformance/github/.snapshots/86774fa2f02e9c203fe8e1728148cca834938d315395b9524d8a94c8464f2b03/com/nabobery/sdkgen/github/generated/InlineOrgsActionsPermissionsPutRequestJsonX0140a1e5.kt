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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions/put/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions/put/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5.Serializer::class)
public class InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5(
  public val enabledRepositories: EnabledRepositories,
  public val allowedActions: AllowedActions? = null,
  public val shaPinningRequired: Boolean? = null,
) {
  public class Builder {
    private var enabledRepositoriesValue: EnabledRepositories? = null

    public var enabledRepositories: EnabledRepositories
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    public var allowedActions: AllowedActions? = null

    public var shaPinningRequired: Boolean? = null

    public fun build(): InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5(
        enabledRepositories = enabledRepositories,
        allowedActions = allowedActions,
        shaPinningRequired = shaPinningRequired,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 must be a JSON object")
      val enabledRepositories = json.decodeRequired<EnabledRepositories>(rawObject, "enabled_repositories")
      return InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5(
        enabledRepositories = enabledRepositories,
        allowedActions = rawObject["allowed_actions"]?.let { json.decodeFromJsonElement<AllowedActions>(it) },
        shaPinningRequired = rawObject["sha_pinning_required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
        value.allowedActions?.let { put("allowed_actions", json.encodeToJsonElement(it)) }
        value.shaPinningRequired?.let { put("sha_pinning_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissionsPutRequestJsonX0140a1e5(block: InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5.Builder.() -> Unit): InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 = InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsPermissionsPutRequestJsonX0140a1e5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
