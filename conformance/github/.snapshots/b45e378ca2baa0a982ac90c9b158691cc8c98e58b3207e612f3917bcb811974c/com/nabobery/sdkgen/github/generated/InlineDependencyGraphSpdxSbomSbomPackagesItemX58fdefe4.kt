package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/packages/items
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom/properties/sbom/properties/packages/items
 */
@Serializable(with = InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4.Serializer::class)
public class InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4(
  /**
   * A unique SPDX identifier for the package.
   */
  public val spdxid: String? = null,
  /**
   * The copyright holders of the package, and any dates present with those notices, if available.
   */
  public val copyrightText: String? = null,
  /**
   * The location where the package can be downloaded,
   * or NOASSERTION if this has not been determined.
   */
  public val downloadLocation: String? = null,
  externalRefs: List<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e>? = null,
  /**
   * Whether the package's file content has been subjected to
   * analysis during the creation of the SPDX document.
   */
  public val filesAnalyzed: Boolean? = null,
  /**
   * The license of the package as determined while creating the SPDX document.
   */
  public val licenseConcluded: String? = null,
  /**
   * The license of the package as declared by its author, or NOASSERTION if this information
   * was not available when the SPDX document was created.
   */
  public val licenseDeclared: String? = null,
  /**
   * The name of the package.
   */
  public val name: String? = null,
  /**
   * The distribution source of this package, or NOASSERTION if this was not determined.
   */
  public val supplier: String? = null,
  /**
   * The version of the package. If the package does not have an exact version specified,
   * a version range is given.
   */
  public val versionInfo: String? = null,
) {
  public val externalRefs:
      List<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e>? =
      externalRefs?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * A unique SPDX identifier for the package.
     */
    public var spdxid: String? = null

    /**
     * The copyright holders of the package, and any dates present with those notices, if available.
     */
    public var copyrightText: String? = null

    /**
     * The location where the package can be downloaded,
     * or NOASSERTION if this has not been determined.
     */
    public var downloadLocation: String? = null

    private var externalRefsValue:
        List<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e>? = null

    public var externalRefs:
        List<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e>?
      get() = externalRefsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        externalRefsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether the package's file content has been subjected to
     * analysis during the creation of the SPDX document.
     */
    public var filesAnalyzed: Boolean? = null

    /**
     * The license of the package as determined while creating the SPDX document.
     */
    public var licenseConcluded: String? = null

    /**
     * The license of the package as declared by its author, or NOASSERTION if this information
     * was not available when the SPDX document was created.
     */
    public var licenseDeclared: String? = null

    /**
     * The name of the package.
     */
    public var name: String? = null

    /**
     * The distribution source of this package, or NOASSERTION if this was not determined.
     */
    public var supplier: String? = null

    /**
     * The version of the package. If the package does not have an exact version specified,
     * a version range is given.
     */
    public var versionInfo: String? = null

    public fun build(): InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4 = InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4(
      spdxid = spdxid,
      copyrightText = copyrightText,
      downloadLocation = downloadLocation,
      externalRefs = externalRefs,
      filesAnalyzed = filesAnalyzed,
      licenseConcluded = licenseConcluded,
      licenseDeclared = licenseDeclared,
      name = name,
      supplier = supplier,
      versionInfo = versionInfo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4 must be a JSON object")
      return InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4(
        spdxid = rawObject["SPDXID"]?.let { json.decodeFromJsonElement<String>(it) },
        copyrightText = rawObject["copyrightText"]?.let { json.decodeFromJsonElement<String>(it) },
        downloadLocation = rawObject["downloadLocation"]?.let { json.decodeFromJsonElement<String>(it) },
        externalRefs = rawObject["externalRefs"]?.let { json.decodeFromJsonElement<List<InlineDependencyGraphSpdxSbomSbomPackagesItemExternalRefsItemX8ad0074e>>(it) },
        filesAnalyzed = rawObject["filesAnalyzed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        licenseConcluded = rawObject["licenseConcluded"]?.let { json.decodeFromJsonElement<String>(it) },
        licenseDeclared = rawObject["licenseDeclared"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        supplier = rawObject["supplier"]?.let { json.decodeFromJsonElement<String>(it) },
        versionInfo = rawObject["versionInfo"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.spdxid?.let { put("SPDXID", it) }
        value.copyrightText?.let { put("copyrightText", it) }
        value.downloadLocation?.let { put("downloadLocation", it) }
        value.externalRefs?.let { put("externalRefs", json.encodeToJsonElement(it)) }
        value.filesAnalyzed?.let { put("filesAnalyzed", json.encodeToJsonElement(it)) }
        value.licenseConcluded?.let { put("licenseConcluded", it) }
        value.licenseDeclared?.let { put("licenseDeclared", it) }
        value.name?.let { put("name", it) }
        value.supplier?.let { put("supplier", it) }
        value.versionInfo?.let { put("versionInfo", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4(block: InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4.Builder.() -> Unit): InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4 = InlineDependencyGraphSpdxSbomSbomPackagesItemX58fdefe4.build(block)
