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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/vulnerabilities/items/properties/first_patched_version.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory/pro
 * perties/vulnerabilities/items/properties/first_patched_version
 */
@Serializable(with = InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15.Serializer::class)
public class InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15(
  public val identifier: String,
) {
  public class Builder {
    private var identifierValue: String? = null

    public var identifier: String
      get() = requireNotNull(identifierValue) { "identifier is required" }
      set(`value`) {
        identifierValue = value
      }

    public fun build(): InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 {
      check(identifierValue != null) { "identifier is required" }
      return InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15(
        identifier = identifier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 must be a JSON object")
      val identifier = json.decodeRequired<String>(rawObject, "identifier")
      return InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15(
        identifier = identifier,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("identifier", value.identifier)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15(block: InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15.Builder.() -> Unit): InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 = InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSecurityAdvis6020SecurityAdvisoryFirstPatchedVersionXad719e15 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
