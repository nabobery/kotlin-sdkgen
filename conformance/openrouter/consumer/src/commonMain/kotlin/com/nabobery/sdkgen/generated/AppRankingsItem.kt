package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AppRankingsItem.
 */
@Serializable(with = AppRankingsItem.Serializer::class)
public class AppRankingsItem(
  /**
   * Stable numeric identifier of the app on OpenRouter.
   */
  public val appId: Int,
  /**
   * Public display name of the app.
   */
  public val appName: String,
  /**
   * 1-based position of the app within this response, per the requested `sort`.
   */
  public val rank: Int,
  /**
   * Number of requests attributed to the app inside the date window.
   */
  public val totalRequests: Int,
  /**
   * Sum of `prompt_tokens + completion_tokens` attributed to the app inside the date window, returned as a decimal
   * string so 64-bit values are not truncated.
   */
  public val totalTokens: String,
) {
  public class Builder {
    private var appIdValue: Int? = null

    public var appId: Int
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var appNameValue: String? = null

    public var appName: String
      get() = requireNotNull(appNameValue) { "appName is required" }
      set(`value`) {
        appNameValue = value
      }

    private var rankValue: Int? = null

    public var rank: Int
      get() = requireNotNull(rankValue) { "rank is required" }
      set(`value`) {
        rankValue = value
      }

    private var totalRequestsValue: Int? = null

    public var totalRequests: Int
      get() = requireNotNull(totalRequestsValue) { "totalRequests is required" }
      set(`value`) {
        totalRequestsValue = value
      }

    private var totalTokensValue: String? = null

    public var totalTokens: String
      get() = requireNotNull(totalTokensValue) { "totalTokens is required" }
      set(`value`) {
        totalTokensValue = value
      }

    public fun build(): AppRankingsItem {
      check(appIdValue != null) { "appId is required" }
      check(appNameValue != null) { "appName is required" }
      check(rankValue != null) { "rank is required" }
      check(totalRequestsValue != null) { "totalRequests is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return AppRankingsItem(
        appId = appId,
        appName = appName,
        rank = rank,
        totalRequests = totalRequests,
        totalTokens = totalTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AppRankingsItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AppRankingsItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AppRankingsItem {
      val jsonDecoder = decoder.requireJsonDecoder("AppRankingsItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AppRankingsItem must be a JSON object")
      val appId = json.decodeRequired<Int>(raw, "app_id")
      val appName = json.decodeRequired<String>(raw, "app_name")
      val rank = json.decodeRequired<Int>(raw, "rank")
      val totalRequests = json.decodeRequired<Int>(raw, "total_requests")
      val totalTokens = json.decodeRequired<String>(raw, "total_tokens")
      return AppRankingsItem(
        appId = appId,
        appName = appName,
        rank = rank,
        totalRequests = totalRequests,
        totalTokens = totalTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AppRankingsItem) {
      val jsonEncoder = encoder.requireJsonEncoder("AppRankingsItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", json.encodeToJsonElement(value.appId))
        put("app_name", value.appName)
        put("rank", json.encodeToJsonElement(value.rank))
        put("total_requests", json.encodeToJsonElement(value.totalRequests))
        put("total_tokens", value.totalTokens)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun appRankingsItem(block: AppRankingsItem.Builder.() -> Unit): AppRankingsItem = AppRankingsItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AppRankingsItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
