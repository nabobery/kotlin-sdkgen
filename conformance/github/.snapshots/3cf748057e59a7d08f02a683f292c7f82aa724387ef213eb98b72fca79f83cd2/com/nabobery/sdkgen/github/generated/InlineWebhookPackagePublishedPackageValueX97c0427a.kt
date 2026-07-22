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
 * Information about the package.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValueX97c0427a.Serializer::class)
public class InlineWebhookPackagePublishedPackageValueX97c0427a(
  public val createdAt: String?,
  public val description: String?,
  public val ecosystem: String,
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val namespace: String,
  public val owner: InlineWebhookPackagePublishedPackageValueOwnerXb682cbbc?,
  public val packageType: String,
  public val packageVersion: InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572?,
  public val registry: InlineWebhookPackagePublishedPackageValueRegistryXe99e144e?,
  public val updatedAt: String?,
) {
  public class Builder {
    private var ecosystemValue: String? = null

    public var ecosystem: String
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
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

    private var namespaceValue: String? = null

    public var namespace: String
      get() = requireNotNull(namespaceValue) { "namespace is required" }
      set(`value`) {
        namespaceValue = value
      }

    private var packageTypeValue: String? = null

    public var packageType: String
      get() = requireNotNull(packageTypeValue) { "packageType is required" }
      set(`value`) {
        packageTypeValue = value
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
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

    private var ownerState: FieldState<InlineWebhookPackagePublishedPackageValueOwnerXb682cbbc?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var owner: InlineWebhookPackagePublishedPackageValueOwnerXb682cbbc?
      get() = ownerState.valueOrNull()
      set(`value`) {
        ownerState = value.toNullableFieldState()
      }

    private var packageVersionState:
        FieldState<InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var packageVersion: InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572?
      get() = packageVersionState.valueOrNull()
      set(`value`) {
        packageVersionState = value.toNullableFieldState()
      }

    private var registryState:
        FieldState<InlineWebhookPackagePublishedPackageValueRegistryXe99e144e?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var registry: InlineWebhookPackagePublishedPackageValueRegistryXe99e144e?
      get() = registryState.valueOrNull()
      set(`value`) {
        registryState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPackagePublishedPackageValueX97c0427a {
      check(ecosystemValue != null) { "ecosystem is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(namespaceValue != null) { "namespace is required" }
      check(packageTypeValue != null) { "packageType is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(ownerState !== FieldState.Absent) { "owner is required, even when null" }
      check(packageVersionState !== FieldState.Absent) { "packageVersion is required, even when null" }
      check(registryState !== FieldState.Absent) { "registry is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return InlineWebhookPackagePublishedPackageValueX97c0427a(
        createdAt = createdAtState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        ecosystem = ecosystem,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        namespace = namespace,
        owner = ownerState.valueOrNull(),
        packageType = packageType,
        packageVersion = packageVersionState.valueOrNull(),
        registry = registryState.valueOrNull(),
        updatedAt = updatedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueX97c0427a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValueX97c0427a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValueX97c0427a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValueX97c0427a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a must be a JSON object")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val namespace = json.decodeRequired<String>(rawObject, "namespace")
      val packageType = json.decodeRequired<String>(rawObject, "package_type")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("owner")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'owner'")
      }
      val owner = rawObject["owner"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValueOwnerXb682cbbc?>(requireNotNull(element)) }
      if (!rawObject.containsKey("package_version")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'package_version'")
      }
      val packageVersion = rawObject["package_version"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValuePackageVersionXc920f572?>(requireNotNull(element)) }
      if (!rawObject.containsKey("registry")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'registry'")
      }
      val registry = rawObject["registry"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPackagePublishedPackageValueRegistryXe99e144e?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPackagePublishedPackageValueX97c0427a(
        createdAt = createdAt,
        description = description,
        ecosystem = ecosystem,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        namespace = namespace,
        owner = owner,
        packageType = packageType,
        packageVersion = packageVersion,
        registry = registry,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValueX97c0427a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValueX97c0427a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ecosystem", value.ecosystem)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("namespace", value.namespace)
        put("owner", value.owner?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("package_type", value.packageType)
        put("package_version", value.packageVersion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("registry", value.registry?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValueX97c0427a(block: InlineWebhookPackagePublishedPackageValueX97c0427a.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueX97c0427a = InlineWebhookPackagePublishedPackageValueX97c0427a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPackagePublishedPackageValueX97c0427a property '" + name + "' is not nullable")
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
