package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Community Profile
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/community-profile
 */
@Serializable(with = CommunityProfile.Serializer::class)
public class CommunityProfile internal constructor(
  public val description: String?,
  public val documentation: String?,
  public val files: InlineCommunityProfileFilesX362f42fd,
  public val healthPercentage: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  private val contentReportsEnabledState: FieldState<Boolean>,
) {
  public val contentReportsEnabled: Boolean?
    get() = contentReportsEnabledState.valueOrNull()

  public constructor(
    description: String?,
    documentation: String?,
    files: InlineCommunityProfileFilesX362f42fd,
    healthPercentage: Int,
    updatedAt: String?,
  ) : this(description = description,
  documentation = documentation,
  files = files,
  healthPercentage = healthPercentage,
  updatedAt = updatedAt,
  contentReportsEnabledState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content_reports_enabled`.
   */
  public fun contentReportsEnabledPresence(): FieldPresence = contentReportsEnabledState.presence

  public class Builder {
    private var filesValue: InlineCommunityProfileFilesX362f42fd? = null

    public var files: InlineCommunityProfileFilesX362f42fd
      get() = requireNotNull(filesValue) { "files is required" }
      set(`value`) {
        filesValue = value
      }

    private var healthPercentageValue: Int? = null

    public var healthPercentage: Int
      get() = requireNotNull(healthPercentageValue) { "healthPercentage is required" }
      set(`value`) {
        healthPercentageValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var documentationState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var documentation: String?
      get() = documentationState.valueOrNull()
      set(`value`) {
        documentationState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var contentReportsEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var contentReportsEnabled: Boolean?
      get() = contentReportsEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "contentReportsEnabled is not nullable; call unsetContentReportsEnabled() to omit it" }
        contentReportsEnabledState = FieldState.Value(present)
      }

    /**
     * Omits `content_reports_enabled` from serialized output.
     */
    public fun unsetContentReportsEnabled() {
      contentReportsEnabledState = FieldState.Absent
    }

    public fun build(): CommunityProfile {
      check(filesValue != null) { "files is required" }
      check(healthPercentageValue != null) { "healthPercentage is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(documentationState !== FieldState.Absent) { "documentation is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return CommunityProfile(
        description = descriptionState.valueOrNull(),
        documentation = documentationState.valueOrNull(),
        files = files,
        healthPercentage = healthPercentage,
        updatedAt = updatedAtState.valueOrNull(),
        contentReportsEnabledState = contentReportsEnabledState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommunityProfile = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CommunityProfile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommunityProfile {
      val jsonDecoder = decoder.requireJsonDecoder("CommunityProfile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommunityProfile must be a JSON object")
      val files = json.decodeRequired<InlineCommunityProfileFilesX362f42fd>(rawObject, "files")
      val healthPercentage = json.decodeRequired<Int>(rawObject, "health_percentage")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("CommunityProfile is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("documentation")) {
        throw SerializationException("CommunityProfile is missing required property 'documentation'")
      }
      val documentation = rawObject["documentation"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("CommunityProfile is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CommunityProfile(
        description = description,
        documentation = documentation,
        files = files,
        healthPercentage = healthPercentage,
        updatedAt = updatedAt,
        contentReportsEnabledState = json.decodeOptional(rawObject, "content_reports_enabled", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommunityProfile) {
      val jsonEncoder = encoder.requireJsonEncoder("CommunityProfile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("documentation", value.documentation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("files", json.encodeToJsonElement(value.files))
        put("health_percentage", json.encodeToJsonElement(value.healthPercentage))
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("content_reports_enabled", value.contentReportsEnabledState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun communityProfile(block: CommunityProfile.Builder.() -> Unit): CommunityProfile = CommunityProfile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommunityProfile is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CommunityProfile property '" + name + "' is not nullable")
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
