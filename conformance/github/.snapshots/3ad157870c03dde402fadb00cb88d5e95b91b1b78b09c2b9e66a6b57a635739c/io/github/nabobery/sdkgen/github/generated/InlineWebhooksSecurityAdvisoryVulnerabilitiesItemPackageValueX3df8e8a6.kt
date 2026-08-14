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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items/properti
 * es/package.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items/properti
 * es/package
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6.Serializer::class)
public class InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6(
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

    public fun build(): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 {
      check(ecosystemValue != null) { "ecosystem is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6(
        ecosystem = ecosystem,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 must be a JSON object")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6(
        ecosystem = ecosystem,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ecosystem", value.ecosystem)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6(block: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
