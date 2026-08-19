package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/delete/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/delete/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineKeysDeleteResponse200JsonXc3c3c322.Serializer::class)
public class InlineKeysDeleteResponse200JsonXc3c3c322(
  /**
   * Confirmation that the API key was deleted
   */
  public val deleted: Boolean,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    public fun build(): InlineKeysDeleteResponse200JsonXc3c3c322 {
      check(deletedValue != null) { "deleted is required" }
      return InlineKeysDeleteResponse200JsonXc3c3c322(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysDeleteResponse200JsonXc3c3c322 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysDeleteResponse200JsonXc3c3c322> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysDeleteResponse200JsonXc3c3c322 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysDeleteResponse200JsonXc3c3c322")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysDeleteResponse200JsonXc3c3c322 must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      return InlineKeysDeleteResponse200JsonXc3c3c322(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysDeleteResponse200JsonXc3c3c322) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysDeleteResponse200JsonXc3c3c322")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysDeleteResponse200JsonXc3c3c322(block: InlineKeysDeleteResponse200JsonXc3c3c322.Builder.() -> Unit): InlineKeysDeleteResponse200JsonXc3c3c322 = InlineKeysDeleteResponse200JsonXc3c3c322.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeysDeleteResponse200JsonXc3c3c322 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
