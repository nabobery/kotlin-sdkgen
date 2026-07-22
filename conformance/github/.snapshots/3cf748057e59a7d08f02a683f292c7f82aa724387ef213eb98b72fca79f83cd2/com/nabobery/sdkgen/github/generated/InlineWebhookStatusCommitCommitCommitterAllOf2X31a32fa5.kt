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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/commit
 * ter/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/commit
 * ter/allOf/1
 */
@Serializable(with = InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5.Serializer::class)
public class InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5(
  public val date: String,
  public val email: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    public var email: String? = null

    public var name: String? = null

    public fun build(): InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 {
      check(dateValue != null) { "date is required" }
      return InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5(
        date = date,
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      return InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5(
        date = date,
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5(block: InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5.Builder.() -> Unit): InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 = InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookStatusCommitCommitCommitterAllOf2X31a32fa5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
