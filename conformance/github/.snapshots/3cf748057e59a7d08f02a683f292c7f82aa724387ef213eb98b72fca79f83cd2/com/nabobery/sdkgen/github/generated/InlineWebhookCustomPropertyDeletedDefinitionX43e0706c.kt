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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-deleted/properties/definition.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-deleted/properties/definition
 */
@Serializable(with = InlineWebhookCustomPropertyDeletedDefinitionX43e0706c.Serializer::class)
public class InlineWebhookCustomPropertyDeletedDefinitionX43e0706c(
  /**
   * The name of the property that was deleted.
   */
  public val propertyName: String,
) {
  public class Builder {
    private var propertyNameValue: String? = null

    public var propertyName: String
      get() = requireNotNull(propertyNameValue) { "propertyName is required" }
      set(`value`) {
        propertyNameValue = value
      }

    public fun build(): InlineWebhookCustomPropertyDeletedDefinitionX43e0706c {
      check(propertyNameValue != null) { "propertyName is required" }
      return InlineWebhookCustomPropertyDeletedDefinitionX43e0706c(
        propertyName = propertyName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCustomPropertyDeletedDefinitionX43e0706c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCustomPropertyDeletedDefinitionX43e0706c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCustomPropertyDeletedDefinitionX43e0706c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCustomPropertyDeletedDefinitionX43e0706c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCustomPropertyDeletedDefinitionX43e0706c must be a JSON object")
      val propertyName = json.decodeRequired<String>(rawObject, "property_name")
      return InlineWebhookCustomPropertyDeletedDefinitionX43e0706c(
        propertyName = propertyName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCustomPropertyDeletedDefinitionX43e0706c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCustomPropertyDeletedDefinitionX43e0706c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("property_name", value.propertyName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCustomPropertyDeletedDefinitionX43e0706c(block: InlineWebhookCustomPropertyDeletedDefinitionX43e0706c.Builder.() -> Unit): InlineWebhookCustomPropertyDeletedDefinitionX43e0706c = InlineWebhookCustomPropertyDeletedDefinitionX43e0706c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCustomPropertyDeletedDefinitionX43e0706c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
