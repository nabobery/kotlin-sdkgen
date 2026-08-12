package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/vulnerabilities/items/properties/package.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/vulnerabilities/items/properties/package
 */
@Serializable(with = InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c.Serializer::class)
public class InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c(
  public val ecosystem: String,
  public val name: String,
) {
  public class Builder {
    private var ecosystemValue: String? = null

    public var ecosystem: String
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c {
      check(ecosystemValue != null) { "ecosystem is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c(
        ecosystem = ecosystem,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c must be a JSON object")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c(
        ecosystem = ecosystem,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ecosystem", value.ecosystem)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c(block: InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c.Builder.() -> Unit): InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c = InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSecurityAdvis6020SecurityAdvisoryPackageValueX1352401c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
