package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1test_clocks~1{test_clock}~1advance/post/requestBody/content/a
 * pplication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1test_clocks~1{test_clock}~1advance/post/requestBody/content/a
 * pplication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4.Serializer::class)
public class InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4(
  /**
   * The time to advance the test clock. Must be after the test clock's current frozen time. Cannot be more than two
   * intervals in the future from the shortest subscription in this test clock. If there are no subscriptions in this
   * test clock, it cannot be more than two years in the future.
   */
  public val frozenTime: Int,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var frozenTimeValue: Int? = null

    public var frozenTime: Int
      get() = requireNotNull(frozenTimeValue) { "frozenTime is required" }
      set(`value`) {
        frozenTimeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 {
      check(frozenTimeValue != null) { "frozenTime is required" }
      return InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4(
        frozenTime = frozenTime,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 must be a JSON object")
      val frozenTime = json.decodeRequired<Int>(rawObject, "frozen_time")
      return InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4(
        frozenTime = frozenTime,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("frozen_time", json.encodeToJsonElement(value.frozenTime))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4(block: InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4.Builder.() -> Unit): InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 = InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
