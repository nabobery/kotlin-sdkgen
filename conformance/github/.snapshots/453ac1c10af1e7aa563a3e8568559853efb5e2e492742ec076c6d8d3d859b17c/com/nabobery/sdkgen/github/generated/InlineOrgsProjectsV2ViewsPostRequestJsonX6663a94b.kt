package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1views/post/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1views/post/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b.Serializer::class)
public class InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b(
  /**
   * The layout of the view.
   */
  public val layout: InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf,
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
    private var layoutValue: InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf? = null

    public var layout: InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf
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

    public fun build(): InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b {
      check(layoutValue != null) { "layout is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b(
        layout = layout,
        name = name,
        filter = filter,
        visibleFields = visibleFields,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b must be a JSON object")
      val layout = json.decodeRequired<InlineOrgsProjectsV2ViewsPostRequestJsonLayoutXc90a36cf>(rawObject, "layout")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b(
        layout = layout,
        name = name,
        filter = rawObject["filter"]?.let { json.decodeFromJsonElement<String>(it) },
        visibleFields = rawObject["visible_fields"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b")
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

public fun inlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b(block: InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b.Builder.() -> Unit): InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b = InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
