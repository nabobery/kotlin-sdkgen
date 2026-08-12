package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Topic Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item
 */
@Serializable(with = TopicSearchResultItem.Serializer::class)
public class TopicSearchResultItem internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val createdBy: String?,
  public val curated: Boolean,
  public val description: String?,
  public val displayName: String?,
  public val featured: Boolean,
  public val name: String,
  public val released: String?,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val shortDescription: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  aliasesState: FieldState<List<InlineTopicSearchResultItemAliasesItemX910b2844>?>,
  private val logoUrlState: FieldState<String?>,
  relatedState: FieldState<List<InlineTopicSearchResultItemRelatedItemX12870445>?>,
  private val repositoryCountState: FieldState<Int?>,
  textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>>,
) {
  private val aliasesState: FieldState<List<InlineTopicSearchResultItemAliasesItemX910b2844>?> =
      aliasesState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val relatedState: FieldState<List<InlineTopicSearchResultItemRelatedItemX12870445>?> =
      relatedState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
      textMatchesState.copyValue { fieldValue -> fieldValue.toList() }

  public val aliases: List<InlineTopicSearchResultItemAliasesItemX910b2844>?
    get() = aliasesState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val logoUrl: String?
    get() = logoUrlState.valueOrNull()

  public val related: List<InlineTopicSearchResultItemRelatedItemX12870445>?
    get() = relatedState.valueOrNull()

  public val repositoryCount: Int?
    get() = repositoryCountState.valueOrNull()

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
    get() = textMatchesState.valueOrNull()

  public constructor(
    createdAt: String,
    createdBy: String?,
    curated: Boolean,
    description: String?,
    displayName: String?,
    featured: Boolean,
    name: String,
    released: String?,
    score: Double,
    shortDescription: String?,
    updatedAt: String,
  ) : this(createdAt = createdAt,
  createdBy = createdBy,
  curated = curated,
  description = description,
  displayName = displayName,
  featured = featured,
  name = name,
  released = released,
  score = score,
  shortDescription = shortDescription,
  updatedAt = updatedAt,
  aliasesState = FieldState.Absent,
  logoUrlState = FieldState.Absent,
  relatedState = FieldState.Absent,
  repositoryCountState = FieldState.Absent,
  textMatchesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `aliases`.
   */
  public fun aliasesPresence(): FieldPresence = aliasesState.presence

  /**
   * Returns the wire presence of `logo_url`.
   */
  public fun logoUrlPresence(): FieldPresence = logoUrlState.presence

  /**
   * Returns the wire presence of `related`.
   */
  public fun relatedPresence(): FieldPresence = relatedState.presence

  /**
   * Returns the wire presence of `repository_count`.
   */
  public fun repositoryCountPresence(): FieldPresence = repositoryCountState.presence

  /**
   * Returns the wire presence of `text_matches`.
   */
  public fun textMatchesPresence(): FieldPresence = textMatchesState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var curatedValue: Boolean? = null

    public var curated: Boolean
      get() = requireNotNull(curatedValue) { "curated is required" }
      set(`value`) {
        curatedValue = value
      }

    private var featuredValue: Boolean? = null

    public var featured: Boolean
      get() = requireNotNull(featuredValue) { "featured is required" }
      set(`value`) {
        featuredValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var createdByState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdBy: String?
      get() = createdByState.valueOrNull()
      set(`value`) {
        createdByState = value.toNullableFieldState()
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

    private var displayNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var displayName: String?
      get() = displayNameState.valueOrNull()
      set(`value`) {
        displayNameState = value.toNullableFieldState()
      }

    private var releasedState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var released: String?
      get() = releasedState.valueOrNull()
      set(`value`) {
        releasedState = value.toNullableFieldState()
      }

    private var shortDescriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var shortDescription: String?
      get() = shortDescriptionState.valueOrNull()
      set(`value`) {
        shortDescriptionState = value.toNullableFieldState()
      }

    private var aliasesState: FieldState<List<InlineTopicSearchResultItemAliasesItemX910b2844>?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var aliases: List<InlineTopicSearchResultItemAliasesItemX910b2844>?
      get() = aliasesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        aliasesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var logoUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var logoUrl: String?
      get() = logoUrlState.valueOrNull()
      set(`value`) {
        logoUrlState = value.toNullableFieldState()
      }

    private var relatedState: FieldState<List<InlineTopicSearchResultItemRelatedItemX12870445>?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var related: List<InlineTopicSearchResultItemRelatedItemX12870445>?
      get() = relatedState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        relatedState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var repositoryCountState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var repositoryCount: Int?
      get() = repositoryCountState.valueOrNull()
      set(`value`) {
        repositoryCountState = value.toNullableFieldState()
      }

    private var textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "textMatches is not nullable; call unsetTextMatches() to omit it" }
        textMatchesState = FieldState.Value(present.toList())
      }

    /**
     * Omits `aliases` from serialized output.
     */
    public fun unsetAliases() {
      aliasesState = FieldState.Absent
    }

    /**
     * Omits `logo_url` from serialized output.
     */
    public fun unsetLogoUrl() {
      logoUrlState = FieldState.Absent
    }

    /**
     * Omits `related` from serialized output.
     */
    public fun unsetRelated() {
      relatedState = FieldState.Absent
    }

    /**
     * Omits `repository_count` from serialized output.
     */
    public fun unsetRepositoryCount() {
      repositoryCountState = FieldState.Absent
    }

    /**
     * Omits `text_matches` from serialized output.
     */
    public fun unsetTextMatches() {
      textMatchesState = FieldState.Absent
    }

    public fun build(): TopicSearchResultItem {
      check(createdAtValue != null) { "createdAt is required" }
      check(curatedValue != null) { "curated is required" }
      check(featuredValue != null) { "featured is required" }
      check(nameValue != null) { "name is required" }
      check(scoreValue != null) { "score is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(createdByState !== FieldState.Absent) { "createdBy is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(displayNameState !== FieldState.Absent) { "displayName is required, even when null" }
      check(releasedState !== FieldState.Absent) { "released is required, even when null" }
      check(shortDescriptionState !== FieldState.Absent) { "shortDescription is required, even when null" }
      return TopicSearchResultItem(
        createdAt = createdAt,
        createdBy = createdByState.valueOrNull(),
        curated = curated,
        description = descriptionState.valueOrNull(),
        displayName = displayNameState.valueOrNull(),
        featured = featured,
        name = name,
        released = releasedState.valueOrNull(),
        score = score,
        shortDescription = shortDescriptionState.valueOrNull(),
        updatedAt = updatedAt,
        aliasesState = aliasesState,
        logoUrlState = logoUrlState,
        relatedState = relatedState,
        repositoryCountState = repositoryCountState,
        textMatchesState = textMatchesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TopicSearchResultItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TopicSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TopicSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("TopicSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TopicSearchResultItem must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val curated = json.decodeRequired<Boolean>(rawObject, "curated")
      val featured = json.decodeRequired<Boolean>(rawObject, "featured")
      val name = json.decodeRequired<String>(rawObject, "name")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("created_by")) {
        throw SerializationException("TopicSearchResultItem is missing required property 'created_by'")
      }
      val createdBy = rawObject["created_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("TopicSearchResultItem is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("display_name")) {
        throw SerializationException("TopicSearchResultItem is missing required property 'display_name'")
      }
      val displayName = rawObject["display_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("released")) {
        throw SerializationException("TopicSearchResultItem is missing required property 'released'")
      }
      val released = rawObject["released"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("short_description")) {
        throw SerializationException("TopicSearchResultItem is missing required property 'short_description'")
      }
      val shortDescription = rawObject["short_description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return TopicSearchResultItem(
        createdAt = createdAt,
        createdBy = createdBy,
        curated = curated,
        description = description,
        displayName = displayName,
        featured = featured,
        name = name,
        released = released,
        score = score,
        shortDescription = shortDescription,
        updatedAt = updatedAt,
        aliasesState = json.decodeOptional(rawObject, "aliases", nullable = true),
        logoUrlState = json.decodeOptional(rawObject, "logo_url", nullable = true),
        relatedState = json.decodeOptional(rawObject, "related", nullable = true),
        repositoryCountState = json.decodeOptional(rawObject, "repository_count", nullable = true),
        textMatchesState = json.decodeOptional(rawObject, "text_matches", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: TopicSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("TopicSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("created_by", value.createdBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("curated", json.encodeToJsonElement(value.curated))
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("display_name", value.displayName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("featured", json.encodeToJsonElement(value.featured))
        put("name", value.name)
        put("released", value.released?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("score", json.encodeToJsonElement(value.score))
        put("short_description", value.shortDescription?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        putState("aliases", value.aliasesState, json::encodeToJsonElement)
        putState("logo_url", value.logoUrlState, json::encodeToJsonElement)
        putState("related", value.relatedState, json::encodeToJsonElement)
        putState("repository_count", value.repositoryCountState, json::encodeToJsonElement)
        putState("text_matches", value.textMatchesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun topicSearchResultItem(block: TopicSearchResultItem.Builder.() -> Unit): TopicSearchResultItem = TopicSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TopicSearchResultItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("TopicSearchResultItem property '" + name + "' is not nullable")
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
