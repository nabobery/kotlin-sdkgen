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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1test_clocks/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1test_clocks/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f.Serializer::class)
public class InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f(
  /**
   * The initial frozen time for this test clock.
   */
  public val frozenTime: Int,
  /**
   * Existing customer this test clock will be attached to. Once attached, customers can't be removed from a test clock.
   */
  public val customer: String? = null,
  expand: List<String>? = null,
  /**
   * The name for this test clock.
   */
  public val name: String? = null,
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

    /**
     * Existing customer this test clock will be attached to. Once attached, customers can't be removed from a test
     * clock.
     */
    public var customer: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The name for this test clock.
     */
    public var name: String? = null

    public fun build(): InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f {
      check(frozenTimeValue != null) { "frozenTime is required" }
      return InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f(
        frozenTime = frozenTime,
        customer = customer,
        expand = expand,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f must be a JSON object")
      val frozenTime = json.decodeRequired<Int>(rawObject, "frozen_time")
      return InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f(
        frozenTime = frozenTime,
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("frozen_time", json.encodeToJsonElement(value.frozenTime))
        value.customer?.let { put("customer", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f(block: InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f.Builder.() -> Unit): InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f = InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
