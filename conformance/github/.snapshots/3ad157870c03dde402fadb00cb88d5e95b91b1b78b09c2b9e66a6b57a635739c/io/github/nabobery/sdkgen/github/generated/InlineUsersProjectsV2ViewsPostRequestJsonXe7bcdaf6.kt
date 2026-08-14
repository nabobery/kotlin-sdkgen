package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{user_id}~1projectsV2~1{project_number}~1views/post/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{user_id}~1projectsV2~1{project_number}~1views/post/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6.Serializer::class)
public class InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6(
  /**
   * The layout of the view.
   */
  public val layout: InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f,
  /**
   * The name of the view.
   */
  public val name: String,
  /**
   * The filter query for the view. See [Filtering
   * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filt
   * ering-projects) for more information.
   */
  public val filter: String? = null,
  visibleFields: List<Int>? = null,
) {
  /**
   * `visible_fields` is not applicable to `roadmap` layout views.
   * For `table` and `board` layouts, this represents the field IDs that should be visible in the view. If not provided,
   * the default visible fields will be used.
   */
  public val visibleFields: List<Int>? = visibleFields?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var layoutValue: InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f? = null

    public var layout: InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f
      get() = requireNotNull(layoutValue) { "layout is required" }
      set(`value`) {
        layoutValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The filter query for the view. See [Filtering
     * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/fi
     * ltering-projects) for more information.
     */
    public var filter: String? = null

    private var visibleFieldsValue: List<Int>? = null

    /**
     * `visible_fields` is not applicable to `roadmap` layout views.
     * For `table` and `board` layouts, this represents the field IDs that should be visible in the view. If not
     * provided, the default visible fields will be used.
     */
    public var visibleFields: List<Int>?
      get() = visibleFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        visibleFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 {
      check(layoutValue != null) { "layout is required" }
      check(nameValue != null) { "name is required" }
      return InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6(
        layout = layout,
        name = name,
        filter = filter,
        visibleFields = visibleFields,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 must be a JSON object")
      val layout = json.decodeRequired<InlineUsersProjectsV2ViewsPostRequestJsonLayoutXe93be57f>(rawObject, "layout")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6(
        layout = layout,
        name = name,
        filter = rawObject["filter"]?.let { json.decodeFromJsonElement<String>(it) },
        visibleFields = rawObject["visible_fields"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("layout", json.encodeToJsonElement(value.layout))
        put("name", value.name)
        value.filter?.let { put("filter", it) }
        value.visibleFields?.let { put("visible_fields", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6(block: InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6.Builder.() -> Unit): InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 = InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
