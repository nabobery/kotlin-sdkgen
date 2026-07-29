package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/online.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/online
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c must be a JSON object")
      return InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c")
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

public fun inlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c(block: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c.Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c = InlineV1SourcesPostRequestFormMandateAcceptanceOnlineX321a611c.build(block)
