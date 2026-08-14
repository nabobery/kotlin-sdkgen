package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}~1verify/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}~1verify/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersSourcesVerifyPostRequestFormX329337c2.Serializer::class)
public class InlineV1CustomersSourcesVerifyPostRequestFormX329337c2(
  amounts: List<Int>? = null,
  expand: List<String>? = null,
) {
  /**
   * Two positive integers, in *cents*, equal to the values of the microdeposits sent to the bank account.
   */
  public val amounts: List<Int>? = amounts?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountsValue: List<Int>? = null

    /**
     * Two positive integers, in *cents*, equal to the values of the microdeposits sent to the bank account.
     */
    public var amounts: List<Int>?
      get() = amountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        amountsValue = value?.let { collection0 -> collection0.toList() }
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

    public fun build(): InlineV1CustomersSourcesVerifyPostRequestFormX329337c2 = InlineV1CustomersSourcesVerifyPostRequestFormX329337c2(
      amounts = amounts,
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSourcesVerifyPostRequestFormX329337c2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSourcesVerifyPostRequestFormX329337c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesVerifyPostRequestFormX329337c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesVerifyPostRequestFormX329337c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSourcesVerifyPostRequestFormX329337c2 must be a JSON object")
      return InlineV1CustomersSourcesVerifyPostRequestFormX329337c2(
        amounts = rawObject["amounts"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesVerifyPostRequestFormX329337c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSourcesVerifyPostRequestFormX329337c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amounts?.let { put("amounts", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSourcesVerifyPostRequestFormX329337c2(block: InlineV1CustomersSourcesVerifyPostRequestFormX329337c2.Builder.() -> Unit): InlineV1CustomersSourcesVerifyPostRequestFormX329337c2 = InlineV1CustomersSourcesVerifyPostRequestFormX329337c2.build(block)
