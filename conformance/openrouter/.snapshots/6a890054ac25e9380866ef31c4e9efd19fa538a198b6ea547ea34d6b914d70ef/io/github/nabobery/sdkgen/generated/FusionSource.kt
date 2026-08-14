package io.github.nabobery.sdkgen.generated

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
 * A web page retrieved via web search during a fusion run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionSource
 */
@Serializable(with = FusionSource.Serializer::class)
public class FusionSource(
  /**
   * Title of the retrieved web page.
   */
  public val title: String,
  /**
   * URL of the web page a panel or the judge retrieved during the run.
   */
  public val url: String,
) {
  public class Builder {
    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): FusionSource {
      check(titleValue != null) { "title is required" }
      check(urlValue != null) { "url is required" }
      return FusionSource(
        title = title,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionSource {
      val jsonDecoder = decoder.requireJsonDecoder("FusionSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionSource must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      val url = json.decodeRequired<String>(rawObject, "url")
      return FusionSource(
        title = title,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionSource) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionSource(block: FusionSource.Builder.() -> Unit): FusionSource = FusionSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
