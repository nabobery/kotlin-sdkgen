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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/cwes/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/cwes/items
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryCwesItemX7071aa94.Serializer::class)
public class InlineWebhooksSecurityAdvisoryCwesItemX7071aa94(
  public val cweId: String,
  public val name: String,
) {
  public class Builder {
    private var cweIdValue: String? = null

    public var cweId: String
      get() = requireNotNull(cweIdValue) { "cweId is required" }
      set(`value`) {
        cweIdValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 {
      check(cweIdValue != null) { "cweId is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhooksSecurityAdvisoryCwesItemX7071aa94(
        cweId = cweId,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryCwesItemX7071aa94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 must be a JSON object")
      val cweId = json.decodeRequired<String>(rawObject, "cwe_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhooksSecurityAdvisoryCwesItemX7071aa94(
        cweId = cweId,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryCwesItemX7071aa94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryCwesItemX7071aa94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cwe_id", value.cweId)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryCwesItemX7071aa94(block: InlineWebhooksSecurityAdvisoryCwesItemX7071aa94.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 = InlineWebhooksSecurityAdvisoryCwesItemX7071aa94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryCwesItemX7071aa94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
