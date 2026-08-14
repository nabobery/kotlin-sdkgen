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
 * sdkgen://source/openapi.json#/paths/~1v1~1ephemeral_keys~1{key}/delete/requestBody/content/application~1x-www-form-ur
 * lencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1ephemeral_keys~1{key}/delete/requestBody/content/application~1x-www-form-ur
 * lencoded/schema
 */
@Serializable(with = InlineV1EphemeralKeysDeleteRequestFormX85408ebf.Serializer::class)
public class InlineV1EphemeralKeysDeleteRequestFormX85408ebf(
  expand: List<String>? = null,
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

    public fun build(): InlineV1EphemeralKeysDeleteRequestFormX85408ebf = InlineV1EphemeralKeysDeleteRequestFormX85408ebf(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1EphemeralKeysDeleteRequestFormX85408ebf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1EphemeralKeysDeleteRequestFormX85408ebf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1EphemeralKeysDeleteRequestFormX85408ebf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1EphemeralKeysDeleteRequestFormX85408ebf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1EphemeralKeysDeleteRequestFormX85408ebf must be a JSON object")
      return InlineV1EphemeralKeysDeleteRequestFormX85408ebf(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1EphemeralKeysDeleteRequestFormX85408ebf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1EphemeralKeysDeleteRequestFormX85408ebf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1EphemeralKeysDeleteRequestFormX85408ebf(block: InlineV1EphemeralKeysDeleteRequestFormX85408ebf.Builder.() -> Unit): InlineV1EphemeralKeysDeleteRequestFormX85408ebf = InlineV1EphemeralKeysDeleteRequestFormX85408ebf.build(block)
