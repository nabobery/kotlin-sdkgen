package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Simulated data for the interac_present payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1present_payment_method/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema/properties/interac_present
 */
@Serializable(with = InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a.Serializer::class)
public class InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a(
  public val number: String? = null,
) {
  public class Builder {
    public var number: String? = null

    public fun build(): InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a = InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a(
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a must be a JSON object")
      return InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a(
        number = rawObject["number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a(block: InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a.Builder.() -> Unit): InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a = InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a.build(block)
