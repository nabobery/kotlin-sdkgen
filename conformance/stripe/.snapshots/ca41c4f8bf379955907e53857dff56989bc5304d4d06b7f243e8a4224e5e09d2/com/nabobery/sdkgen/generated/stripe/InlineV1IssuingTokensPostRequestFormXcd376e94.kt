package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens~1{token}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens~1{token}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1IssuingTokensPostRequestFormXcd376e94.Serializer::class)
public class InlineV1IssuingTokensPostRequestFormXcd376e94(
  /**
   * Specifies which status the token should be updated to.
   */
  public val status: InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var statusValue: InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5? = null

    public var status: InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
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

    public fun build(): InlineV1IssuingTokensPostRequestFormXcd376e94 {
      check(statusValue != null) { "status is required" }
      return InlineV1IssuingTokensPostRequestFormXcd376e94(
        status = status,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingTokensPostRequestFormXcd376e94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingTokensPostRequestFormXcd376e94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingTokensPostRequestFormXcd376e94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingTokensPostRequestFormXcd376e94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingTokensPostRequestFormXcd376e94 must be a JSON object")
      val status = json.decodeRequired<InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5>(rawObject, "status")
      return InlineV1IssuingTokensPostRequestFormXcd376e94(
        status = status,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTokensPostRequestFormXcd376e94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingTokensPostRequestFormXcd376e94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingTokensPostRequestFormXcd376e94(block: InlineV1IssuingTokensPostRequestFormXcd376e94.Builder.() -> Unit): InlineV1IssuingTokensPostRequestFormXcd376e94 = InlineV1IssuingTokensPostRequestFormXcd376e94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingTokensPostRequestFormXcd376e94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
