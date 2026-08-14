package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1push-protection-bypasses/post/requestB
 * ody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1push-protection-bypasses/post/requestB
 * ody/content/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52.Serializer::class)
public class InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52(
  public val placeholderId: String,
  public val reason: SecretScanningPushProtectionBypassReason,
) {
  public class Builder {
    private var placeholderIdValue: String? = null

    public var placeholderId: String
      get() = requireNotNull(placeholderIdValue) { "placeholderId is required" }
      set(`value`) {
        placeholderIdValue = value
      }

    private var reasonValue: SecretScanningPushProtectionBypassReason? = null

    public var reason: SecretScanningPushProtectionBypassReason
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    public fun build(): InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 {
      check(placeholderIdValue != null) { "placeholderId is required" }
      check(reasonValue != null) { "reason is required" }
      return InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52(
        placeholderId = placeholderId,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 must be a JSON object")
      val placeholderId = json.decodeRequired<String>(rawObject, "placeholder_id")
      val reason = json.decodeRequired<SecretScanningPushProtectionBypassReason>(rawObject, "reason")
      return InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52(
        placeholderId = placeholderId,
        reason = reason,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("placeholder_id", value.placeholderId)
        put("reason", json.encodeToJsonElement(value.reason))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52(block: InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52.Builder.() -> Unit): InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 = InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
