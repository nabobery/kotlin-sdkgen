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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191(
  public val status: InlineV1SourcesPostRequestFormMandateAcceptanceStatusX915cd527,
  public val date: Int? = null,
  public val ip: String? = null,
  public val offline: InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1? = null,
  public val online: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4? = null,
  public val type: InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    private var statusValue: InlineV1SourcesPostRequestFormMandateAcceptanceStatusX915cd527? = null

    public var status: InlineV1SourcesPostRequestFormMandateAcceptanceStatusX915cd527
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var date: Int? = null

    public var ip: String? = null

    public var offline: InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1? = null

    public var online: InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4? = null

    public var type: InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87? = null

    public var userAgent: String? = null

    public fun build(): InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 {
      check(statusValue != null) { "status is required" }
      return InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191(
        status = status,
        date = date,
        ip = ip,
        offline = offline,
        online = online,
        type = type,
        userAgent = userAgent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 must be a JSON object")
      val status = json.decodeRequired<InlineV1SourcesPostRequestFormMandateAcceptanceStatusX915cd527>(rawObject, "status")
      return InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191(
        status = status,
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAcceptanceOfflineX42651fa1>(it) },
        online = rawObject["online"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAcceptanceOnlineXec4393f4>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
        value.online?.let { put("online", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormMandateAcceptanceX55fac191(block: InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191.Builder.() -> Unit): InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 = InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SourcesPostRequestFormMandateAcceptanceX55fac191 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
