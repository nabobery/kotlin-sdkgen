package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_reports/get/responses/200/content/application~1json/
 * schema
 */
@Serializable(with = InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9.Serializer::class)
public class InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9(
  `data`: List<IdentityVerificationReport>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineV1IdentityVerificationReportsGetResponse200JsonObjectValueX9d3fc029,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  public val `data`: List<IdentityVerificationReport> = data.toList()

  public class Builder {
    private var dataValue: List<IdentityVerificationReport>? = null

    public var `data`: List<IdentityVerificationReport>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue:
        InlineV1IdentityVerificationReportsGetResponse200JsonObjectValueX9d3fc029? = null

    public var objectValue:
        InlineV1IdentityVerificationReportsGetResponse200JsonObjectValueX9d3fc029
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 must be a JSON object")
      val data = json.decodeRequired<List<IdentityVerificationReport>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1IdentityVerificationReportsGetResponse200JsonObjectValueX9d3fc029>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9(block: InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9.Builder.() -> Unit): InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 = InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
