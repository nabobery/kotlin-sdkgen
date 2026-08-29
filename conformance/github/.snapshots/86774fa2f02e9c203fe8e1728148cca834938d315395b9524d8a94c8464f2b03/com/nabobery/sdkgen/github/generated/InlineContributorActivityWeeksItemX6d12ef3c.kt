package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/contributor-activity/properties/weeks/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/contributor-activity/properties/weeks/items
 */
@Serializable(with = InlineContributorActivityWeeksItemX6d12ef3c.Serializer::class)
public class InlineContributorActivityWeeksItemX6d12ef3c(
  public val a: Int? = null,
  public val c: Int? = null,
  public val d: Int? = null,
  public val w: Int? = null,
) {
  public class Builder {
    public var a: Int? = null

    public var c: Int? = null

    public var d: Int? = null

    public var w: Int? = null

    public fun build(): InlineContributorActivityWeeksItemX6d12ef3c = InlineContributorActivityWeeksItemX6d12ef3c(
      a = a,
      c = c,
      d = d,
      w = w,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContributorActivityWeeksItemX6d12ef3c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContributorActivityWeeksItemX6d12ef3c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContributorActivityWeeksItemX6d12ef3c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContributorActivityWeeksItemX6d12ef3c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContributorActivityWeeksItemX6d12ef3c must be a JSON object")
      return InlineContributorActivityWeeksItemX6d12ef3c(
        a = rawObject["a"]?.let { json.decodeFromJsonElement<Int>(it) },
        c = rawObject["c"]?.let { json.decodeFromJsonElement<Int>(it) },
        d = rawObject["d"]?.let { json.decodeFromJsonElement<Int>(it) },
        w = rawObject["w"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContributorActivityWeeksItemX6d12ef3c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContributorActivityWeeksItemX6d12ef3c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.a?.let { put("a", json.encodeToJsonElement(it)) }
        value.c?.let { put("c", json.encodeToJsonElement(it)) }
        value.d?.let { put("d", json.encodeToJsonElement(it)) }
        value.w?.let { put("w", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContributorActivityWeeksItemX6d12ef3c(block: InlineContributorActivityWeeksItemX6d12ef3c.Builder.() -> Unit): InlineContributorActivityWeeksItemX6d12ef3c = InlineContributorActivityWeeksItemX6d12ef3c.build(block)
