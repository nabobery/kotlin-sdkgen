package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-push-protection-bypass.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-push-protection-bypass
 */
@Serializable(with = SecretScanningPushProtectionBypass.Serializer::class)
public class SecretScanningPushProtectionBypass(
  /**
   * The time that the bypass will expire in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val expireAt: String? = null,
  public val reason: SecretScanningPushProtectionBypassReason? = null,
  /**
   * The token type this bypass is for.
   */
  public val tokenType: String? = null,
) {
  public class Builder {
    /**
     * The time that the bypass will expire in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var expireAt: String? = null

    public var reason: SecretScanningPushProtectionBypassReason? = null

    /**
     * The token type this bypass is for.
     */
    public var tokenType: String? = null

    public fun build(): SecretScanningPushProtectionBypass = SecretScanningPushProtectionBypass(
      expireAt = expireAt,
      reason = reason,
      tokenType = tokenType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningPushProtectionBypass = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningPushProtectionBypass> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningPushProtectionBypass {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningPushProtectionBypass")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningPushProtectionBypass must be a JSON object")
      return SecretScanningPushProtectionBypass(
        expireAt = rawObject["expire_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<SecretScanningPushProtectionBypassReason>(it) },
        tokenType = rawObject["token_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningPushProtectionBypass) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningPushProtectionBypass")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expireAt?.let { put("expire_at", it) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.tokenType?.let { put("token_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningPushProtectionBypass(block: SecretScanningPushProtectionBypass.Builder.() -> Unit): SecretScanningPushProtectionBypass = SecretScanningPushProtectionBypass.build(block)
