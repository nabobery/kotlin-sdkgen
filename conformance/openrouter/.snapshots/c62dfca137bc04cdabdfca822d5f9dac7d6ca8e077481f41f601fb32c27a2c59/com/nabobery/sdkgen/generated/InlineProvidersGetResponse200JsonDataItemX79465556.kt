package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1providers/get/responses/200/content/application~1json/schema/properties/data/it
 * ems.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1providers/get/responses/200/content/application~1json/schema/properties/data/it
 * ems
 */
@Serializable(with = InlineProvidersGetResponse200JsonDataItemX79465556.Serializer::class)
public class InlineProvidersGetResponse200JsonDataItemX79465556 internal constructor(
  /**
   * Display name of the provider
   */
  public val name: String,
  /**
   * URL to the provider's privacy policy
   */
  public val privacyPolicyUrl: String?,
  /**
   * URL-friendly identifier for the provider
   */
  public val slug: String,
  datacentersState: FieldState<List<InlineProvidersGetResponse200JsonDataItemDatacentersItemXf4bcf655>?>,
  private val headquartersState:
      FieldState<InlineProvidersGetResponse200JsonDataItemHeadquartersX91a166d1?>,
  private val statusPageUrlState: FieldState<String?>,
  private val termsOfServiceUrlState: FieldState<String?>,
) {
  private val datacentersState:
      FieldState<List<InlineProvidersGetResponse200JsonDataItemDatacentersItemXf4bcf655>?> =
      datacentersState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * ISO 3166-1 Alpha-2 country codes of the provider datacenter locations
   */
  public val datacenters: List<InlineProvidersGetResponse200JsonDataItemDatacentersItemXf4bcf655>?
    get() = datacentersState.valueOrNull()

  /**
   * ISO 3166-1 Alpha-2 country code of the provider headquarters
   */
  public val headquarters: InlineProvidersGetResponse200JsonDataItemHeadquartersX91a166d1?
    get() = headquartersState.valueOrNull()

  /**
   * URL to the provider's status page
   */
  public val statusPageUrl: String?
    get() = statusPageUrlState.valueOrNull()

  /**
   * URL to the provider's terms of service
   */
  public val termsOfServiceUrl: String?
    get() = termsOfServiceUrlState.valueOrNull()

  public constructor(
    name: String,
    privacyPolicyUrl: String?,
    slug: String,
  ) : this(name = name,
  privacyPolicyUrl = privacyPolicyUrl,
  slug = slug,
  datacentersState = FieldState.Absent,
  headquartersState = FieldState.Absent,
  statusPageUrlState = FieldState.Absent,
  termsOfServiceUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `datacenters`.
   */
  public fun datacentersPresence(): FieldPresence = datacentersState.presence

  /**
   * Returns the wire presence of `headquarters`.
   */
  public fun headquartersPresence(): FieldPresence = headquartersState.presence

  /**
   * Returns the wire presence of `status_page_url`.
   */
  public fun statusPageUrlPresence(): FieldPresence = statusPageUrlState.presence

  /**
   * Returns the wire presence of `terms_of_service_url`.
   */
  public fun termsOfServiceUrlPresence(): FieldPresence = termsOfServiceUrlState.presence

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var privacyPolicyUrlState: FieldState<String?> = FieldState.Absent

    /**
     * URL to the provider's privacy policy
     * Required nullable field; assigning `null` records present-null.
     */
    public var privacyPolicyUrl: String?
      get() = privacyPolicyUrlState.valueOrNull()
      set(`value`) {
        privacyPolicyUrlState = value.toNullableFieldState()
      }

    private var datacentersState:
        FieldState<List<InlineProvidersGetResponse200JsonDataItemDatacentersItemXf4bcf655>?> =
        FieldState.Absent

    /**
     * ISO 3166-1 Alpha-2 country codes of the provider datacenter locations
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var datacenters: List<InlineProvidersGetResponse200JsonDataItemDatacentersItemXf4bcf655>?
      get() = datacentersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        datacentersState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var headquartersState:
        FieldState<InlineProvidersGetResponse200JsonDataItemHeadquartersX91a166d1?> =
        FieldState.Absent

    /**
     * ISO 3166-1 Alpha-2 country code of the provider headquarters
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var headquarters: InlineProvidersGetResponse200JsonDataItemHeadquartersX91a166d1?
      get() = headquartersState.valueOrNull()
      set(`value`) {
        headquartersState = value.toNullableFieldState()
      }

    private var statusPageUrlState: FieldState<String?> = FieldState.Absent

    /**
     * URL to the provider's status page
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var statusPageUrl: String?
      get() = statusPageUrlState.valueOrNull()
      set(`value`) {
        statusPageUrlState = value.toNullableFieldState()
      }

    private var termsOfServiceUrlState: FieldState<String?> = FieldState.Absent

    /**
     * URL to the provider's terms of service
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var termsOfServiceUrl: String?
      get() = termsOfServiceUrlState.valueOrNull()
      set(`value`) {
        termsOfServiceUrlState = value.toNullableFieldState()
      }

    /**
     * Omits `datacenters` from serialized output.
     */
    public fun unsetDatacenters() {
      datacentersState = FieldState.Absent
    }

    /**
     * Omits `headquarters` from serialized output.
     */
    public fun unsetHeadquarters() {
      headquartersState = FieldState.Absent
    }

    /**
     * Omits `status_page_url` from serialized output.
     */
    public fun unsetStatusPageUrl() {
      statusPageUrlState = FieldState.Absent
    }

    /**
     * Omits `terms_of_service_url` from serialized output.
     */
    public fun unsetTermsOfServiceUrl() {
      termsOfServiceUrlState = FieldState.Absent
    }

    public fun build(): InlineProvidersGetResponse200JsonDataItemX79465556 {
      check(nameValue != null) { "name is required" }
      check(slugValue != null) { "slug is required" }
      check(privacyPolicyUrlState !== FieldState.Absent) { "privacyPolicyUrl is required, even when null" }
      return InlineProvidersGetResponse200JsonDataItemX79465556(
        name = name,
        privacyPolicyUrl = privacyPolicyUrlState.valueOrNull(),
        slug = slug,
        datacentersState = datacentersState,
        headquartersState = headquartersState,
        statusPageUrlState = statusPageUrlState,
        termsOfServiceUrlState = termsOfServiceUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProvidersGetResponse200JsonDataItemX79465556 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProvidersGetResponse200JsonDataItemX79465556> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProvidersGetResponse200JsonDataItemX79465556 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProvidersGetResponse200JsonDataItemX79465556")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProvidersGetResponse200JsonDataItemX79465556 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      if (!rawObject.containsKey("privacy_policy_url")) {
        throw SerializationException("InlineProvidersGetResponse200JsonDataItemX79465556 is missing required property 'privacy_policy_url'")
      }
      val privacyPolicyUrl = rawObject["privacy_policy_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineProvidersGetResponse200JsonDataItemX79465556(
        name = name,
        privacyPolicyUrl = privacyPolicyUrl,
        slug = slug,
        datacentersState = json.decodeOptional(rawObject, "datacenters", nullable = true),
        headquartersState = json.decodeOptional(rawObject, "headquarters", nullable = true),
        statusPageUrlState = json.decodeOptional(rawObject, "status_page_url", nullable = true),
        termsOfServiceUrlState = json.decodeOptional(rawObject, "terms_of_service_url", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProvidersGetResponse200JsonDataItemX79465556) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProvidersGetResponse200JsonDataItemX79465556")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("privacy_policy_url", value.privacyPolicyUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("slug", value.slug)
        putState("datacenters", value.datacentersState, json::encodeToJsonElement)
        putState("headquarters", value.headquartersState, json::encodeToJsonElement)
        putState("status_page_url", value.statusPageUrlState, json::encodeToJsonElement)
        putState("terms_of_service_url", value.termsOfServiceUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProvidersGetResponse200JsonDataItemX79465556(block: InlineProvidersGetResponse200JsonDataItemX79465556.Builder.() -> Unit): InlineProvidersGetResponse200JsonDataItemX79465556 = InlineProvidersGetResponse200JsonDataItemX79465556.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProvidersGetResponse200JsonDataItemX79465556 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineProvidersGetResponse200JsonDataItemX79465556 property '" + name + "' is not nullable")
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
