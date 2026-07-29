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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The GitHub Pages deployment status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page-deployment
 */
@Serializable(with = PageDeployment.Serializer::class)
public class PageDeployment(
  /**
   * The ID of the GitHub Pages deployment. This is the Git SHA of the deployed commit.
   */
  public val id: InlinePageDeploymentIdX1cee7bf3,
  /**
   * The URI to the deployed GitHub Pages.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pageUrl: String,
  /**
   * The URI to monitor GitHub Pages deployment status.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val statusUrl: String,
  /**
   * The URI to the deployed GitHub Pages preview.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val previewUrl: String? = null,
) {
  public class Builder {
    private var idValue: InlinePageDeploymentIdX1cee7bf3? = null

    public var id: InlinePageDeploymentIdX1cee7bf3
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var pageUrlValue: String? = null

    public var pageUrl: String
      get() = requireNotNull(pageUrlValue) { "pageUrl is required" }
      set(`value`) {
        pageUrlValue = value
      }

    private var statusUrlValue: String? = null

    public var statusUrl: String
      get() = requireNotNull(statusUrlValue) { "statusUrl is required" }
      set(`value`) {
        statusUrlValue = value
      }

    /**
     * The URI to the deployed GitHub Pages preview.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var previewUrl: String? = null

    public fun build(): PageDeployment {
      check(idValue != null) { "id is required" }
      check(pageUrlValue != null) { "pageUrl is required" }
      check(statusUrlValue != null) { "statusUrl is required" }
      return PageDeployment(
        id = id,
        pageUrl = pageUrl,
        statusUrl = statusUrl,
        previewUrl = previewUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PageDeployment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PageDeployment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PageDeployment {
      val jsonDecoder = decoder.requireJsonDecoder("PageDeployment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PageDeployment must be a JSON object")
      val id = json.decodeRequired<InlinePageDeploymentIdX1cee7bf3>(rawObject, "id")
      val pageUrl = json.decodeRequired<String>(rawObject, "page_url")
      val statusUrl = json.decodeRequired<String>(rawObject, "status_url")
      return PageDeployment(
        id = id,
        pageUrl = pageUrl,
        statusUrl = statusUrl,
        previewUrl = rawObject["preview_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PageDeployment) {
      val jsonEncoder = encoder.requireJsonEncoder("PageDeployment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("page_url", value.pageUrl)
        put("status_url", value.statusUrl)
        value.previewUrl?.let { put("preview_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pageDeployment(block: PageDeployment.Builder.() -> Unit): PageDeployment = PageDeployment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PageDeployment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
