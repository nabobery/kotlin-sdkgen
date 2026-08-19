package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://pagination-fixture/openapi.yaml#/components/schemas/WidgetPage.
 *
 * Source: sdkgen://pagination-fixture/openapi.yaml#/components/schemas/WidgetPage
 */
@Serializable(with = WidgetPage.Serializer::class)
public class WidgetPage(
  `data`: List<Widget>,
  public val total: Int? = null,
) {
  public val `data`: List<Widget> = data.toList()

  public class Builder {
    private var dataValue: List<Widget>? = null

    public var `data`: List<Widget>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public var total: Int? = null

    public fun build(): WidgetPage {
      check(dataValue != null) { "data is required" }
      return WidgetPage(
        data = data,
        total = total,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WidgetPage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WidgetPage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WidgetPage {
      val jsonDecoder = decoder.requireJsonDecoder("WidgetPage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WidgetPage must be a JSON object")
      val data = json.decodeRequired<List<Widget>>(rawObject, "data")
      return WidgetPage(
        data = data,
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WidgetPage) {
      val jsonEncoder = encoder.requireJsonEncoder("WidgetPage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        value.total?.let { put("total", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun widgetPage(block: WidgetPage.Builder.() -> Unit): WidgetPage = WidgetPage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WidgetPage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
