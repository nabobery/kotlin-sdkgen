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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1verify_microdeposits/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1verify_microdeposits/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d.Serializer::class)
public class InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d(
  amounts: List<Int>? = null,
  /**
   * The client secret of the SetupIntent.
   */
  public val clientSecret: String? = null,
  /**
   * A six-character code starting with SM present in the microdeposit sent to the bank account.
   */
  public val descriptorCode: String? = null,
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

    /**
     * The client secret of the SetupIntent.
     */
    public var clientSecret: String? = null

    /**
     * A six-character code starting with SM present in the microdeposit sent to the bank account.
     */
    public var descriptorCode: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d = InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d(
      amounts = amounts,
      clientSecret = clientSecret,
      descriptorCode = descriptorCode,
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d must be a JSON object")
      return InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d(
        amounts = rawObject["amounts"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        clientSecret = rawObject["client_secret"]?.let { json.decodeFromJsonElement<String>(it) },
        descriptorCode = rawObject["descriptor_code"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amounts?.let { put("amounts", json.encodeToJsonElement(it)) }
        value.clientSecret?.let { put("client_secret", it) }
        value.descriptorCode?.let { put("descriptor_code", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d(block: InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d.Builder.() -> Unit): InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d = InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d.build(block)
