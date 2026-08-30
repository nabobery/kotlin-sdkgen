package com.nabobery.sdkgen.github.generated

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
 * An enterprise on GitHub. Webhook payloads contain the `enterprise` property when the webhook is configured
 * on an enterprise account or an organization that's part of an enterprise account. For more information,
 * see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/enterprise-webhooks
 */
@Serializable(with = EnterpriseWebhooks.Serializer::class)
public class EnterpriseWebhooks internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the enterprise
   */
  public val id: Int,
  /**
   * The name of the enterprise.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * The slug url identifier for the enterprise.
   */
  public val slug: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  private val descriptionState: FieldState<String?>,
  private val websiteUrlState: FieldState<String?>,
) {
  /**
   * A short description of the enterprise.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The enterprise's website URL.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val websiteUrl: String?
    get() = websiteUrlState.valueOrNull()

  public constructor(
    avatarUrl: String,
    createdAt: String?,
    htmlUrl: String,
    id: Int,
    name: String,
    nodeId: String,
    slug: String,
    updatedAt: String?,
  ) : this(avatarUrl = avatarUrl,
  createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  slug = slug,
  updatedAt = updatedAt,
  descriptionState = FieldState.Absent,
  websiteUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `website_url`.
   */
  public fun websiteUrlPresence(): FieldPresence = websiteUrlState.presence

  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
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

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A short description of the enterprise.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var websiteUrlState: FieldState<String?> = FieldState.Absent

    /**
     * The enterprise's website URL.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var websiteUrl: String?
      get() = websiteUrlState.valueOrNull()
      set(`value`) {
        websiteUrlState = value.toNullableFieldState()
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `website_url` from serialized output.
     */
    public fun unsetWebsiteUrl() {
      websiteUrlState = FieldState.Absent
    }

    public fun build(): EnterpriseWebhooks {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(slugValue != null) { "slug is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return EnterpriseWebhooks(
        avatarUrl = avatarUrl,
        createdAt = createdAtState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        slug = slug,
        updatedAt = updatedAtState.valueOrNull(),
        descriptionState = descriptionState,
        websiteUrlState = websiteUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EnterpriseWebhooks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EnterpriseWebhooks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EnterpriseWebhooks {
      val jsonDecoder = decoder.requireJsonDecoder("EnterpriseWebhooks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EnterpriseWebhooks must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("EnterpriseWebhooks is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("EnterpriseWebhooks is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return EnterpriseWebhooks(
        avatarUrl = avatarUrl,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        slug = slug,
        updatedAt = updatedAt,
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        websiteUrlState = json.decodeOptional(rawObject, "website_url", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: EnterpriseWebhooks) {
      val jsonEncoder = encoder.requireJsonEncoder("EnterpriseWebhooks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("slug", value.slug)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("website_url", value.websiteUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun enterpriseWebhooks(block: EnterpriseWebhooks.Builder.() -> Unit): EnterpriseWebhooks = EnterpriseWebhooks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EnterpriseWebhooks is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("EnterpriseWebhooks property '" + name + "' is not nullable")
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
