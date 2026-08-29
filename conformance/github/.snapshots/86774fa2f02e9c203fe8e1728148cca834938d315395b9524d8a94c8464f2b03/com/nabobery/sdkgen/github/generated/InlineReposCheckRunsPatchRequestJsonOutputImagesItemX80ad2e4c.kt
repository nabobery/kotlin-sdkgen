package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output/properties/images/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output/properties/images/items
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c internal constructor(
  /**
   * The alternative text for the image.
   */
  public val alt: String,
  /**
   * The full URL of the image.
   */
  public val imageUrl: String,
  private val captionState: FieldState<String>,
) {
  /**
   * A short image description.
   */
  public val caption: String?
    get() = captionState.valueOrNull()

  public constructor(alt: String, imageUrl: String) : this(alt = alt,
  imageUrl = imageUrl,
  captionState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `caption`.
   */
  public fun captionPresence(): FieldPresence = captionState.presence

  public class Builder {
    private var altValue: String? = null

    public var alt: String
      get() = requireNotNull(altValue) { "alt is required" }
      set(`value`) {
        altValue = value
      }

    private var imageUrlValue: String? = null

    public var imageUrl: String
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    private var captionState: FieldState<String> = FieldState.Absent

    /**
     * A short image description.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var caption: String?
      get() = captionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "caption is not nullable; call unsetCaption() to omit it" }
        captionState = FieldState.Value(present)
      }

    /**
     * Omits `caption` from serialized output.
     */
    public fun unsetCaption() {
      captionState = FieldState.Absent
    }

    public fun build(): InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c {
      check(altValue != null) { "alt is required" }
      check(imageUrlValue != null) { "imageUrl is required" }
      return InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c(
        alt = alt,
        imageUrl = imageUrl,
        captionState = captionState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c must be a JSON object")
      val alt = json.decodeRequired<String>(rawObject, "alt")
      val imageUrl = json.decodeRequired<String>(rawObject, "image_url")
      return InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c(
        alt = alt,
        imageUrl = imageUrl,
        captionState = json.decodeOptional(rawObject, "caption", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alt", value.alt)
        put("image_url", value.imageUrl)
        putState("caption", value.captionState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c(block: InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c.Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c = InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
