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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1reject/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1reject/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsRejectPostRequestFormXdb22fec1.Serializer::class)
public class InlineV1AccountsRejectPostRequestFormXdb22fec1(
  /**
   * The reason for rejecting the account. Can be `fraud`, `terms_of_service`, or `other`.
   */
  public val reason: String,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
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

    public fun build(): InlineV1AccountsRejectPostRequestFormXdb22fec1 {
      check(reasonValue != null) { "reason is required" }
      return InlineV1AccountsRejectPostRequestFormXdb22fec1(
        reason = reason,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsRejectPostRequestFormXdb22fec1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsRejectPostRequestFormXdb22fec1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsRejectPostRequestFormXdb22fec1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsRejectPostRequestFormXdb22fec1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsRejectPostRequestFormXdb22fec1 must be a JSON object")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      return InlineV1AccountsRejectPostRequestFormXdb22fec1(
        reason = reason,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsRejectPostRequestFormXdb22fec1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsRejectPostRequestFormXdb22fec1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reason", value.reason)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsRejectPostRequestFormXdb22fec1(block: InlineV1AccountsRejectPostRequestFormXdb22fec1.Builder.() -> Unit): InlineV1AccountsRejectPostRequestFormXdb22fec1 = InlineV1AccountsRejectPostRequestFormXdb22fec1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountsRejectPostRequestFormXdb22fec1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
