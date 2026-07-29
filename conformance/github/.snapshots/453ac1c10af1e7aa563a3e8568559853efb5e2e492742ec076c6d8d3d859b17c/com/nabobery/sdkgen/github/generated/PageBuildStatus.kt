package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Page Build Status
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page-build-status
 */
@Serializable(with = PageBuildStatus.Serializer::class)
public class PageBuildStatus(
  public val status: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): PageBuildStatus {
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      return PageBuildStatus(
        status = status,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PageBuildStatus = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PageBuildStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PageBuildStatus {
      val jsonDecoder = decoder.requireJsonDecoder("PageBuildStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PageBuildStatus must be a JSON object")
      val status = json.decodeRequired<String>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PageBuildStatus(
        status = status,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PageBuildStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("PageBuildStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", value.status)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pageBuildStatus(block: PageBuildStatus.Builder.() -> Unit): PageBuildStatus = PageBuildStatus.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PageBuildStatus is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
