package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/get/parameters/0/schema/anyOf/0.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/get/parameters/0/schema/anyOf/0
 */
@Serializable(with = InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe.Serializer::class)
public class InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe(
  public val gt: Int? = null,
  public val gte: Int? = null,
  public val lt: Int? = null,
  public val lte: Int? = null,
) {
  public class Builder {
    public var gt: Int? = null

    public var gte: Int? = null

    public var lt: Int? = null

    public var lte: Int? = null

    public fun build(): InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe = InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe(
      gt = gt,
      gte = gte,
      lt = lt,
      lte = lte,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe must be a JSON object")
      return InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe(
        gt = rawObject["gt"]?.let { json.decodeFromJsonElement<Int>(it) },
        gte = rawObject["gte"]?.let { json.decodeFromJsonElement<Int>(it) },
        lt = rawObject["lt"]?.let { json.decodeFromJsonElement<Int>(it) },
        lte = rawObject["lte"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.gt?.let { put("gt", json.encodeToJsonElement(it)) }
        value.gte?.let { put("gte", json.encodeToJsonElement(it)) }
        value.lt?.let { put("lt", json.encodeToJsonElement(it)) }
        value.lte?.let { put("lte", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe(block: InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe.Builder.() -> Unit): InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe = InlineV1IssuingCardholdersGetParameterAnyOf1Xfd5ceffe.build(block)
