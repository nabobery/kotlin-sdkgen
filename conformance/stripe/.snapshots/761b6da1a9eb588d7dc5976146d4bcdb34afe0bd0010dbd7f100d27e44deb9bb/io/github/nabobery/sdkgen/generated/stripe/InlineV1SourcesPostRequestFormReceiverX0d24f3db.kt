package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Optional parameters for the receiver flow. Can be set only if the source is a receiver (`flow` is `receiver`).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/receiver
 */
@Serializable(with = InlineV1SourcesPostRequestFormReceiverX0d24f3db.Serializer::class)
public class InlineV1SourcesPostRequestFormReceiverX0d24f3db(
  public val refundAttributesMethod:
      InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d? = null,
) {
  public class Builder {
    public var refundAttributesMethod:
        InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d? = null

    public fun build(): InlineV1SourcesPostRequestFormReceiverX0d24f3db = InlineV1SourcesPostRequestFormReceiverX0d24f3db(
      refundAttributesMethod = refundAttributesMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormReceiverX0d24f3db = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormReceiverX0d24f3db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormReceiverX0d24f3db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormReceiverX0d24f3db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormReceiverX0d24f3db must be a JSON object")
      return InlineV1SourcesPostRequestFormReceiverX0d24f3db(
        refundAttributesMethod = rawObject["refund_attributes_method"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormReceiverX0d24f3db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormReceiverX0d24f3db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.refundAttributesMethod?.let { put("refund_attributes_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormReceiverX0d24f3db(block: InlineV1SourcesPostRequestFormReceiverX0d24f3db.Builder.() -> Unit): InlineV1SourcesPostRequestFormReceiverX0d24f3db = InlineV1SourcesPostRequestFormReceiverX0d24f3db.build(block)
