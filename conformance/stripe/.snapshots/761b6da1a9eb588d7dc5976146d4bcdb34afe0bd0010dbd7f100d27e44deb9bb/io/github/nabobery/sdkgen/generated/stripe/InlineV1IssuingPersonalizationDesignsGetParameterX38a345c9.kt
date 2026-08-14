package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/get/parameters/4/schema
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9(
  public val isDefault: Boolean? = null,
  public val isPlatformDefault: Boolean? = null,
) {
  public class Builder {
    public var isDefault: Boolean? = null

    public var isPlatformDefault: Boolean? = null

    public fun build(): InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9 = InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9(
      isDefault = isDefault,
      isPlatformDefault = isPlatformDefault,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9 must be a JSON object")
      return InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9(
        isDefault = rawObject["is_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isPlatformDefault = rawObject["is_platform_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.isDefault?.let { put("is_default", json.encodeToJsonElement(it)) }
        value.isPlatformDefault?.let { put("is_platform_default", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingPersonalizationDesignsGetParameterX38a345c9(block: InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9.Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9 = InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9.build(block)
