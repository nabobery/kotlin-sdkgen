package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1credit_reversals/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1credit_reversals/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff.Serializer::class)
public class InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff(
  /**
   * The ReceivedCredit to reverse.
   */
  public val receivedCredit: String,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var receivedCreditValue: String? = null

    public var receivedCredit: String
      get() = requireNotNull(receivedCreditValue) { "receivedCredit is required" }
      set(`value`) {
        receivedCreditValue = value
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

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff {
      check(receivedCreditValue != null) { "receivedCredit is required" }
      return InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff(
        receivedCredit = receivedCredit,
        expand = expand,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff must be a JSON object")
      val receivedCredit = json.decodeRequired<String>(rawObject, "received_credit")
      return InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff(
        receivedCredit = receivedCredit,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("received_credit", value.receivedCredit)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryCreditReversalsPostRequestFormX88c5efff(block: InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff.Builder.() -> Unit): InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff = InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
