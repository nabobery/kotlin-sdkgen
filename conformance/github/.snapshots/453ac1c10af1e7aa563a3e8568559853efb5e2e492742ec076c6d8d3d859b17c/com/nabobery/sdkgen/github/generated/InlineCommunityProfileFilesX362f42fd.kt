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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/community-profile/properties/files.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/community-profile/properties/files
 */
@Serializable(with = InlineCommunityProfileFilesX362f42fd.Serializer::class)
public class InlineCommunityProfileFilesX362f42fd(
  public val codeOfConduct: NullableCodeOfConductSimple?,
  public val codeOfConductFile: NullableCommunityHealthFile?,
  public val contributing: NullableCommunityHealthFile?,
  public val issueTemplate: NullableCommunityHealthFile?,
  public val license: NullableLicenseSimple?,
  public val pullRequestTemplate: NullableCommunityHealthFile?,
  public val readme: NullableCommunityHealthFile?,
) {
  public class Builder {
    private var codeOfConductState: FieldState<NullableCodeOfConductSimple?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var codeOfConduct: NullableCodeOfConductSimple?
      get() = codeOfConductState.valueOrNull()
      set(`value`) {
        codeOfConductState = value.toNullableFieldState()
      }

    private var codeOfConductFileState: FieldState<NullableCommunityHealthFile?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var codeOfConductFile: NullableCommunityHealthFile?
      get() = codeOfConductFileState.valueOrNull()
      set(`value`) {
        codeOfConductFileState = value.toNullableFieldState()
      }

    private var contributingState: FieldState<NullableCommunityHealthFile?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var contributing: NullableCommunityHealthFile?
      get() = contributingState.valueOrNull()
      set(`value`) {
        contributingState = value.toNullableFieldState()
      }

    private var issueTemplateState: FieldState<NullableCommunityHealthFile?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var issueTemplate: NullableCommunityHealthFile?
      get() = issueTemplateState.valueOrNull()
      set(`value`) {
        issueTemplateState = value.toNullableFieldState()
      }

    private var licenseState: FieldState<NullableLicenseSimple?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var license: NullableLicenseSimple?
      get() = licenseState.valueOrNull()
      set(`value`) {
        licenseState = value.toNullableFieldState()
      }

    private var pullRequestTemplateState: FieldState<NullableCommunityHealthFile?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequestTemplate: NullableCommunityHealthFile?
      get() = pullRequestTemplateState.valueOrNull()
      set(`value`) {
        pullRequestTemplateState = value.toNullableFieldState()
      }

    private var readmeState: FieldState<NullableCommunityHealthFile?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var readme: NullableCommunityHealthFile?
      get() = readmeState.valueOrNull()
      set(`value`) {
        readmeState = value.toNullableFieldState()
      }

    public fun build(): InlineCommunityProfileFilesX362f42fd {
      check(codeOfConductState !== FieldState.Absent) { "codeOfConduct is required, even when null" }
      check(codeOfConductFileState !== FieldState.Absent) { "codeOfConductFile is required, even when null" }
      check(contributingState !== FieldState.Absent) { "contributing is required, even when null" }
      check(issueTemplateState !== FieldState.Absent) { "issueTemplate is required, even when null" }
      check(licenseState !== FieldState.Absent) { "license is required, even when null" }
      check(pullRequestTemplateState !== FieldState.Absent) { "pullRequestTemplate is required, even when null" }
      check(readmeState !== FieldState.Absent) { "readme is required, even when null" }
      return InlineCommunityProfileFilesX362f42fd(
        codeOfConduct = codeOfConductState.valueOrNull(),
        codeOfConductFile = codeOfConductFileState.valueOrNull(),
        contributing = contributingState.valueOrNull(),
        issueTemplate = issueTemplateState.valueOrNull(),
        license = licenseState.valueOrNull(),
        pullRequestTemplate = pullRequestTemplateState.valueOrNull(),
        readme = readmeState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommunityProfileFilesX362f42fd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCommunityProfileFilesX362f42fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommunityProfileFilesX362f42fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommunityProfileFilesX362f42fd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommunityProfileFilesX362f42fd must be a JSON object")
      if (!rawObject.containsKey("code_of_conduct")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'code_of_conduct'")
      }
      val codeOfConduct = rawObject["code_of_conduct"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCodeOfConductSimple?>(requireNotNull(element)) }
      if (!rawObject.containsKey("code_of_conduct_file")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'code_of_conduct_file'")
      }
      val codeOfConductFile = rawObject["code_of_conduct_file"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCommunityHealthFile?>(requireNotNull(element)) }
      if (!rawObject.containsKey("contributing")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'contributing'")
      }
      val contributing = rawObject["contributing"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCommunityHealthFile?>(requireNotNull(element)) }
      if (!rawObject.containsKey("issue_template")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'issue_template'")
      }
      val issueTemplate = rawObject["issue_template"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCommunityHealthFile?>(requireNotNull(element)) }
      if (!rawObject.containsKey("license")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'license'")
      }
      val license = rawObject["license"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableLicenseSimple?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_request_template")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'pull_request_template'")
      }
      val pullRequestTemplate = rawObject["pull_request_template"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCommunityHealthFile?>(requireNotNull(element)) }
      if (!rawObject.containsKey("readme")) {
        throw SerializationException("InlineCommunityProfileFilesX362f42fd is missing required property 'readme'")
      }
      val readme = rawObject["readme"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCommunityHealthFile?>(requireNotNull(element)) }
      return InlineCommunityProfileFilesX362f42fd(
        codeOfConduct = codeOfConduct,
        codeOfConductFile = codeOfConductFile,
        contributing = contributing,
        issueTemplate = issueTemplate,
        license = license,
        pullRequestTemplate = pullRequestTemplate,
        readme = readme,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommunityProfileFilesX362f42fd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommunityProfileFilesX362f42fd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code_of_conduct", value.codeOfConduct?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("code_of_conduct_file", value.codeOfConductFile?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("contributing", value.contributing?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("issue_template", value.issueTemplate?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("license", value.license?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_request_template", value.pullRequestTemplate?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("readme", value.readme?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommunityProfileFilesX362f42fd(block: InlineCommunityProfileFilesX362f42fd.Builder.() -> Unit): InlineCommunityProfileFilesX362f42fd = InlineCommunityProfileFilesX362f42fd.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineCommunityProfileFilesX362f42fd property '" + name + "' is not nullable")
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
