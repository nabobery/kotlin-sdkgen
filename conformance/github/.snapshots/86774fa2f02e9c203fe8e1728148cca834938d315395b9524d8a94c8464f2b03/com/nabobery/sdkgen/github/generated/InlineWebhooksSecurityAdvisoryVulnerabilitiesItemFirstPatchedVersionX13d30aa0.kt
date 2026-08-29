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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items/properti
 * es/first_patched_version.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items/properti
 * es/first_patched_version
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0.Serializer::class)
public class InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0(
  public val identifier: String,
) {
  public class Builder {
    private var identifierValue: String? = null

    public var identifier: String
      get() = requireNotNull(identifierValue) { "identifier is required" }
      set(`value`) {
        identifierValue = value
      }

    public fun build(): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 {
      check(identifierValue != null) { "identifier is required" }
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0(
        identifier = identifier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 must be a JSON object")
      val identifier = json.decodeRequired<String>(rawObject, "identifier")
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0(
        identifier = identifier,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("identifier", value.identifier)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0(block: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
