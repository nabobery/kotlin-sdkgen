package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/online.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/online
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4 = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4 must be a JSON object")
      return InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4(block: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4.Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4 = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4.build(block)
