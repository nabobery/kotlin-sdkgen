package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom
 */
@Serializable(with = InlineDependencyGraphSpdxSbomSbomX52ad58c1.Serializer::class)
public class InlineDependencyGraphSpdxSbomSbomX52ad58c1(
  /**
   * The SPDX identifier for the SPDX document.
   */
  public val spdxid: String,
  public val creationInfo: InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76,
  /**
   * The license under which the SPDX document is licensed.
   */
  public val dataLicense: String,
  /**
   * The namespace for the SPDX document.
   */
  public val documentNamespace: String,
  /**
   * The name of the SPDX document.
   */
  public val name: String,
  packages: List<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4>,
  /**
   * The version of the SPDX specification that this document conforms to.
   */
  public val spdxVersion: String,
  /**
   * An optional comment about the SPDX document.
   */
  public val comment: String? = null,
  relationships: List<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54>? = null,
) {
  public val packages: List<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4> =
      packages.toList()

  public val relationships: List<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54>? =
      relationships?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var spdxidValue: String? = null

    public var spdxid: String
      get() = requireNotNull(spdxidValue) { "spdxid is required" }
      set(`value`) {
        spdxidValue = value
      }

    private var creationInfoValue: InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76? = null

    public var creationInfo: InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76
      get() = requireNotNull(creationInfoValue) { "creationInfo is required" }
      set(`value`) {
        creationInfoValue = value
      }

    private var dataLicenseValue: String? = null

    public var dataLicense: String
      get() = requireNotNull(dataLicenseValue) { "dataLicense is required" }
      set(`value`) {
        dataLicenseValue = value
      }

    private var documentNamespaceValue: String? = null

    public var documentNamespace: String
      get() = requireNotNull(documentNamespaceValue) { "documentNamespace is required" }
      set(`value`) {
        documentNamespaceValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var packagesValue: List<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4>? = null

    public var packages: List<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4>
      get() = requireNotNull(packagesValue) { "packages is required" }.toList()
      set(`value`) {
        packagesValue = value.toList()
      }

    private var spdxVersionValue: String? = null

    public var spdxVersion: String
      get() = requireNotNull(spdxVersionValue) { "spdxVersion is required" }
      set(`value`) {
        spdxVersionValue = value
      }

    /**
     * An optional comment about the SPDX document.
     */
    public var comment: String? = null

    private var relationshipsValue:
        List<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54>? = null

    public var relationships: List<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54>?
      get() = relationshipsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        relationshipsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineDependencyGraphSpdxSbomSbomX52ad58c1 {
      check(spdxidValue != null) { "spdxid is required" }
      check(creationInfoValue != null) { "creationInfo is required" }
      check(dataLicenseValue != null) { "dataLicense is required" }
      check(documentNamespaceValue != null) { "documentNamespace is required" }
      check(nameValue != null) { "name is required" }
      check(packagesValue != null) { "packages is required" }
      check(spdxVersionValue != null) { "spdxVersion is required" }
      return InlineDependencyGraphSpdxSbomSbomX52ad58c1(
        spdxid = spdxid,
        creationInfo = creationInfo,
        dataLicense = dataLicense,
        documentNamespace = documentNamespace,
        name = name,
        packages = packages,
        spdxVersion = spdxVersion,
        comment = comment,
        relationships = relationships,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomX52ad58c1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependencyGraphSpdxSbomSbomX52ad58c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphSpdxSbomSbomX52ad58c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphSpdxSbomSbomX52ad58c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomX52ad58c1 must be a JSON object")
      val spdxid = json.decodeRequired<String>(rawObject, "SPDXID")
      val creationInfo = json.decodeRequired<InlineDependencyGraphSpdxSbomSbomCreationInfoX09044c76>(rawObject, "creationInfo")
      val dataLicense = json.decodeRequired<String>(rawObject, "dataLicense")
      val documentNamespace = json.decodeRequired<String>(rawObject, "documentNamespace")
      val name = json.decodeRequired<String>(rawObject, "name")
      val packages = json.decodeRequired<List<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4>>(rawObject, "packages")
      val spdxVersion = json.decodeRequired<String>(rawObject, "spdxVersion")
      return InlineDependencyGraphSpdxSbomSbomX52ad58c1(
        spdxid = spdxid,
        creationInfo = creationInfo,
        dataLicense = dataLicense,
        documentNamespace = documentNamespace,
        name = name,
        packages = packages,
        spdxVersion = spdxVersion,
        comment = rawObject["comment"]?.let { json.decodeFromJsonElement<String>(it) },
        relationships = rawObject["relationships"]?.let { json.decodeFromJsonElement<List<InlineDependencyGraphSpdxSbomSbomRelationshipsItemX86934e54>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphSpdxSbomSbomX52ad58c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphSpdxSbomSbomX52ad58c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("SPDXID", value.spdxid)
        put("creationInfo", json.encodeToJsonElement(value.creationInfo))
        put("dataLicense", value.dataLicense)
        put("documentNamespace", value.documentNamespace)
        put("name", value.name)
        put("packages", json.encodeToJsonElement(value.packages))
        put("spdxVersion", value.spdxVersion)
        value.comment?.let { put("comment", it) }
        value.relationships?.let { put("relationships", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphSpdxSbomSbomX52ad58c1(block: InlineDependencyGraphSpdxSbomSbomX52ad58c1.Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomX52ad58c1 = InlineDependencyGraphSpdxSbomSbomX52ad58c1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomX52ad58c1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
