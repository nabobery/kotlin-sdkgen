package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Gist History
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-history
 */
@Serializable(with = GistHistory.Serializer::class)
public class GistHistory(
  public val changeStatus: InlineGistHistoryChangeStatusX5a594288? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val committedAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  public val user: NullableSimpleUser? = null,
  public val version: String? = null,
) {
  public class Builder {
    public var changeStatus: InlineGistHistoryChangeStatusX5a594288? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var committedAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public var user: NullableSimpleUser? = null

    public var version: String? = null

    public fun build(): GistHistory = GistHistory(
      changeStatus = changeStatus,
      committedAt = committedAt,
      url = url,
      user = user,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GistHistory = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GistHistory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GistHistory {
      val jsonDecoder = decoder.requireJsonDecoder("GistHistory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GistHistory must be a JSON object")
      return GistHistory(
        changeStatus = rawObject["change_status"]?.let { json.decodeFromJsonElement<InlineGistHistoryChangeStatusX5a594288>(it) },
        committedAt = rawObject["committed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GistHistory) {
      val jsonEncoder = encoder.requireJsonEncoder("GistHistory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.changeStatus?.let { put("change_status", json.encodeToJsonElement(it)) }
        value.committedAt?.let { put("committed_at", it) }
        value.url?.let { put("url", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gistHistory(block: GistHistory.Builder.() -> Unit): GistHistory = GistHistory.build(block)
