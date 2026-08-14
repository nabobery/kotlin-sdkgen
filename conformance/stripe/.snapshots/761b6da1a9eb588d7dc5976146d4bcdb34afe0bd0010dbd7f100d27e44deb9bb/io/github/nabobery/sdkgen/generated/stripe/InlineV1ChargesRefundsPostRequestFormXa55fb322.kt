package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormXa55fb322.Serializer::class)
public class InlineV1ChargesRefundsPostRequestFormXa55fb322(
  expand: List<String>? = null,
  public val metadata: InlineV1ChargesRefundsPostRequestFormMetadataX5c502965? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public var metadata: InlineV1ChargesRefundsPostRequestFormMetadataX5c502965? = null

    public fun build(): InlineV1ChargesRefundsPostRequestFormXa55fb322 = InlineV1ChargesRefundsPostRequestFormXa55fb322(
      expand = expand,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesRefundsPostRequestFormXa55fb322 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormXa55fb322> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormXa55fb322 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesRefundsPostRequestFormXa55fb322")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesRefundsPostRequestFormXa55fb322 must be a JSON object")
      return InlineV1ChargesRefundsPostRequestFormXa55fb322(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ChargesRefundsPostRequestFormMetadataX5c502965>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormXa55fb322) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesRefundsPostRequestFormXa55fb322")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesRefundsPostRequestFormXa55fb322(block: InlineV1ChargesRefundsPostRequestFormXa55fb322.Builder.() -> Unit): InlineV1ChargesRefundsPostRequestFormXa55fb322 = InlineV1ChargesRefundsPostRequestFormXa55fb322.build(block)
